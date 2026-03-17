//Colocando o foco no campo de nome para facilitar o preenchimento do formulário
document.getElementById("nomeDigitado").focus();

function validarFormulario() {
    let nome      = document.getElementById("nomeDigitado").value;
    let sobrenome = document.getElementById("sobrenomeDigitado").value;
    let email     = document.getElementById("emailDigitado").value;
    let senha     = document.getElementById("senhaDigitada").value;
    
    if (nome === "") {
        alert("Por favor, preencha o campo: Nome");
        document.getElementById("nomeDigitado").style.boxShadow = "5px 5px 5px red";
        return false;
    }
    else if (sobrenome === "") {
        alert("Por favor, preencha o campo: Sobrenome");
        document.getElementById("sobrenomeDigitado").style.boxShadow = " 5px 5px 5px red";
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
    else {
        alert(`Usuário: ${nome}, cadastrado com sucesso!`)
    }
}

validarFormulario();