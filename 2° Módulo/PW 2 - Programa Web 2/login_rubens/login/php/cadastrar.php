<?php
session_start();

require "Usuario.class.php";
$usuario = new Usuario();


if( isset($_POST['nome']) ){
    $nome  = $_POST['nome']; 
    $email = $_POST['email'];
    $senha = $_POST['senha'];
    echo"nome $nome";
    $conn = $usuario->conecta();
    
    if( $conn ){
        $user = $usuario->checkUser($email);
        if( !$user ){
            $user = $usuario->inserirUsuario($nome, $email, $senha);
            if($user){
                $_SESSION['nome'] = $nome;
                header("Location:home.php");
            }else{
                echo "Erro ao cadastrar o Usuario.";
            }
        }else{
            echo "Usuario JA CADASTRADO. Vá para o Login";
            exit();
        }
    }else{
        echo "Banco indisponivel, tente mais tarde!";
    }
}else{
    echo "sem post";
}

?>
