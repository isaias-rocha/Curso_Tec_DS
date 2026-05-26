/**
 * cadastro-feedback.js
 *
 * Intercepta o submit do #formCadastro, envia os dados via fetch para process.php
 * e exibe o feedback de sucesso ou erro com base no JSON retornado pelo backend.
 *
 * Não depende de nenhuma biblioteca externa.
 */

(function () {
    'use strict';

    const form    = document.getElementById('formCadastro');
    const btn     = document.getElementById('btnCadastrar');
    const feedback = document.getElementById('feedback');

    // Foco inicial no primeiro campo
    document.getElementById('nomeDigitado').focus();

    // ─── Validação local (mantém a mesma lógica do formulario.html) ───────────

    function validarCampos() {
        const nome     = document.getElementById('nomeDigitado');
        const email    = document.getElementById('emailDigitado');
        const endereco = document.getElementById('enderecoDigitado');

        // Remove destaques anteriores
        [nome, email, endereco].forEach(el => el.style.boxShadow = '');

        if (nome.value.trim() === '') {
            nome.style.boxShadow = '3px 3px 5px yellow';
            nome.focus();
            return 'Por favor, preencha o campo de nome.';
        }
        if (email.value.trim() === '') {
            email.style.boxShadow = '3px 3px 5px yellow';
            email.focus();
            return 'Por favor, preencha o campo de e-mail.';
        }
        if (endereco.value.trim() === '') {
            endereco.style.boxShadow = '3px 3px 5px yellow';
            endereco.focus();
            return 'Por favor, preencha o campo de endereço.';
        }

        return null; // sem erros
    }

    // ─── Exibição do feedback com base no JSON ─────────────────────────────────

    function exibirFeedback(json) {
        feedback.className = '';
        feedback.style.display = 'block';

        if (json.sucesso) {
            feedback.className = 'sucesso';
            feedback.innerHTML =
                '<span class="icone">✅</span>' +
                '<strong>' + json.mensagem + '</strong>' +
                '<span class="detalhe">ID do cadastro: #' + json.id + '</span>';

            form.reset();
            document.getElementById('nomeDigitado').focus();
        } else {
            feedback.className = 'erro';

            const erros = json.erros
                ? json.erros.map(e => '<li>' + e + '</li>').join('')
                : '<li>' + (json.erro || 'Erro desconhecido.') + '</li>';

            feedback.innerHTML =
                '<span class="icone">❌</span>' +
                '<strong>Não foi possível concluir o cadastro:</strong>' +
                '<ul style="margin:0.4rem 0 0 1rem;padding:0">' + erros + '</ul>';
        }
    }

    function exibirErroRede() {
        feedback.style.display = 'block';
        feedback.className = 'erro';
        feedback.innerHTML =
            '<span class="icone">⚠️</span>' +
            '<strong>Falha na comunicação com o servidor.</strong>' +
            '<span class="detalhe">Verifique se o servidor está ativo e tente novamente.</span>';
    }

    // ─── Submit via fetch ──────────────────────────────────────────────────────

    form.addEventListener('submit', async function (e) {
        e.preventDefault();

        feedback.style.display = 'none';

        const erroLocal = validarCampos();
        if (erroLocal) {
            feedback.style.display = 'block';
            feedback.className = 'erro';
            feedback.innerHTML = '<span class="icone">⚠️</span>' + erroLocal;
            return;
        }

        btn.disabled = true;
        btn.textContent = 'Enviando…';

        try {
            const resposta = await fetch('process.php', {
                method: 'POST',
                body: new FormData(form)
            });

            // Consome o JSON retornado pelo backend
            const json = await resposta.json();

            exibirFeedback(json);

        } catch (_) {
            exibirErroRede();
        } finally {
            btn.disabled = false;
            btn.textContent = 'Cadastrar';
        }
    });
}());
