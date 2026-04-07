//Colocando o foco no campo de nome para facilitar o preenchimento do formulário
document.getElementById("nomeDigitado").focus();

function validarFormulario() {
    let nome = document.getElementById("nomeDigitado").value;
    let endereco = document.getElementById("senhaDigitada").value;
    let email = document.getElementById("emailDigitado").value;
    let senha = document.getElementById("enderecoDigitado").value;


    if (nome === "") {
        alert("Por favor, preencha o campo: Nome");
        document.getElementById("nomeDigitado").style.boxShadow = "5px 5px 5px red";
        return false; // 
    }
    else if (endereco === "") {
        alert("Por favor, preencha o campo: Endereço");
        document.getElementById("enderecoDigitado").style.boxShadow = " 5px 5px 5px red";
        return false;
    }
    else if (email === "") {
        alert("Por favor, preencha o campo: E-mail");
        document.getElementById("emailDigitado").style.boxShadow = " 5px 5px 5px red";
        return false;
    }
    else if (senha === "") {
        alert("Por favor, preencha o campo: Senha");
        document.getElementById("senhaDigitada").style.boxShadow = " 5px 5px 5px red";
        return false;
    }

    else if ((nome !== "") && (endereco) && (email !== "") && (senha)) {
        alert(`Usuário: ${nome}, cadastrado com sucesso!`)
        document.getElementById("nomeDigitado").style.boxShadow = " 5px 5px 5px green";
        document.getElementById("enderecoDigitado").style.boxShadow = " 5px 5px 5px green";
        document.getElementById("emailDigitado").style.boxShadow = " 5px 5px 5px green";
        document.getElementById("senhaDigitada").style.boxShadow = " 5px 5px 5px green";
        return true; //libera o envio para o process.php
    }
    else { }

}

validarFormulario();