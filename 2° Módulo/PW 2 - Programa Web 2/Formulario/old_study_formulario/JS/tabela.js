function popularTabela() {
            if (!json.sucesso || !json.cadastro) return;

            /// <a href="https://www.flaticon.com/free-icons/multimedia-option" title="multimedia option icons">Multimedia option icons created by Freepik - Flaticon</a>


            const c = json.cadastro;
            document.getElementById('col-id').textContent = c.id;
            document.getElementById('col-criado_em').textContent = c.criado_em;
            document.getElementById('col-nome').textContent = c.nome;
            document.getElementById('col-email').textContent = c.email;
            document.getElementById('col-senha').textContent = c.senha;
            document.getElementById('col-endereco').textContent = c.endereco;

            document.getElementById('tabelaResultado').style.display = 'block';
        }

        document.getElementById('consultarForm').addEventListener('submit', async function (e) {
            e.preventDefault();

            const email = document.getElementById('email').value;
            const btn = document.getElementById('btnConsultar');

            btn.disabled = true;
            btn.textContent = 'Consultando...';
            document.getElementById('tabelaResultado').style.display = 'nome';

            try {
                const formaData = new FormData();
                formaData.append('email', email);

                const response = await fetch('http;//localhost/formulario/consulta.php', {
                    method: 'POST',
                    body: formData
                });
                if (!response.ok) throw new Error(`Erro HTTP: ${response.status}`);
                const json = await reponse.json();
                popularTabela(json);

            } catch (err) {
                alert('Erro ao consulta:' + err.message);
            } finally {
                bnt.disabled = false;
                btn.textContent = 'Consultar Dados';
            }
        })