<?php
session_start();
require "Usuario.class.php";
$usuario = new Usuario();

$connection = $usuario->conecta();
if( $connection ){
   
    if( isset($_POST['email'])){
        $email = addlashes($_POST['email']);
        $senha = md5(addlashes($_POST['senha']));
        
        $user = $usuario->checkUser( $email );
        
        if( $user ){
            $user = $usuario->checkPass($email, $senha);
            if($user){
                $_SESSION['email'] = $email;
                header("Location:home.php");
            }else{
                echo "Usuario ou senha incorretos";
                exit();
            }
        }else{
            echo "Usuario nao cadastrado!";
            header("Location:cadastrar.php");
        }
    }
}else{
    echo "Banco indisponivel. Tente mais Tarde!";
    exit();
}