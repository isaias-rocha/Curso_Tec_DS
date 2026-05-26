<?php
include 'Usuario.class.php';
$usuario = new Usuario();
$con = $usuario->conecta();

if (!$con) {
    echo "Banco indisponivel. tente mais tarde!";
    exit();
}else{
    if($_GET['codigo']){
        $id = $_GET['codigo'];   
        
        $user = $usuario->listarUsuario($id);
        
        if(empty($user)){
            echo "Usuario nao encontrado!";
            exit();
        } 
    }else{
        echo "Usuario nao encontrado!";
        exit();
    }
}
?>


<html lang="pt-br">
    <head>
        <!--Serve par setar o UNICODE do site para o usado em PT-BR-->
        <meta charset="UTF-8"/> 
        <title>Tela de Login</title>
        <title>Seja bem-vindo</title>
        
        <!--vinculando a tela, com o CSS para estilizar a página-->
        <link rel="stylesheet" type="text/css" href="../css/index.css">

        <!--vinculando tela com o script que vamos criar as funcionalidades-->
        

        <!-- Para usar o  SweetAlert2 CDN -->
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

    </head>
    <body>
        <div class="container-principal">
            <!-- aqui é o espaço onde vamos criar o formulário-->
            <div class="formulario">
                <h2>Cadastro de Usuário</h2>
                <form action="../php/editar_submit.php" method="get">
                    <!-- adicionando campos do formulário-->
                    <input type="hidden" name   = "id"    value = "<?php echo $user['id']; ?>">
                    <input type="text"   name   = "nome"  value = "<?php echo $user['nome']; ?>">
                    <input type="text"   name   = "email" value = "<?php echo $user['email']; ?>">

                    <input type="password" name = "senha" placeholder="Digite a nova senha">

                    <input type="submit" value="Salvar">
                </form>             
            </div>
        </div>
    </body>
</html>
