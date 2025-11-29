function logar(){

var email = document.getElementById('emailDigitado').value ;
var senha = document.getElementById('senhaDigitada').value ;

if(email=='admin@etec.com' && senha =='admin123'){
alert ('LOGIN OK - SEJA BEM VINDO!!!');
}
else{
    alert('USUÁRIO OU SENHA INCORRETOS');
}
}