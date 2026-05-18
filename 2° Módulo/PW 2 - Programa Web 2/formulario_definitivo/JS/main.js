// Foco inicial no nome
document.getElementById("nomeDigitado").focus();

// Validação do Cadastro
function validarFormulario() {
    let nome = document.getElementById("nomeDigitado");
    let email = document.getElementById("emailDigitado");
    let endereco = document.getElementById("enderecoDigitado");

    [nome, email, endereco].forEach(el => el.style.boxShadow = "none");

    if (nome.value.trim() === "") {
        alert("Por favor, preencha o campo de nome.");
        nome.style.boxShadow = "0 0 5px #ffc107";
        nome.focus();
        return false;
    }
    if (email.value.trim() === "") {
        alert("Por favor, preencha o campo de e-mail.");
        email.style.boxShadow = "0 0 5px #ffc107";
        email.focus();
        return false;
    }
    if (endereco.value.trim() === "") {
        alert("Por favor, preencha o campo de endereço.");
        endereco.style.boxShadow = "0 0 5px #ffc107";
        endereco.focus();
        return false;
    }
    return true;
}

// Lógica da Consulta
function popularTabela(json) {
    if (!json.sucesso || !json.cadastro) {
        alert("Nenhum registro encontrado.");
        document.getElementById('tabelaResultado').style.display = 'none';
        return;
    }

    document.getElementById('col-id').textContent = json.cadastro.id;
    document.getElementById('col-nome').textContent = json.cadastro.nome;
    document.getElementById('col-email').textContent = json.cadastro.email;
    document.getElementById('col-endereco').textContent = json.cadastro.endereco;

    document.getElementById('tabelaResultado').style.display = 'block';
}

document.getElementById('consultaForm').addEventListener('submit', async function (e) {
    e.preventDefault();

    const email = document.getElementById('emailBusca').value;
    const btn = document.getElementById('btnConsultar');

    btn.disabled = true;
    btn.innerHTML = '<span class="spinner-border spinner-border-sm"></span> Consultando...';
    document.getElementById('tabelaResultado').style.display = 'none';

    try {
        const formData = new FormData();
        formData.append('email', email);

        const response = await fetch('consulta.php', {
            method: 'POST',
            body: formData
        });

        const json = await response.json();
        popularTabela(json);

    } catch (err) {
        alert('Erro na consulta. Verifique se o servidor está ativo.');
    } finally {
        btn.disabled = false;
        btn.textContent = 'Consultar Dados';
    }
});