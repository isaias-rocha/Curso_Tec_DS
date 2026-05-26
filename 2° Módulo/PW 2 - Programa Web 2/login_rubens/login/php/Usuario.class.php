<?php

class Usuario
{
    private $id;
    private $email;
    private $nome;
    private $senha;
    private $pdo;

    public function conecta()
    {
        $dns = "mysql:dbname=banco;host=localhost";
        $userName = "root";
        $userPass = "";

        try {
            $this->pdo = new PDO($dns, $userName, $userPass);
            return true;
        } catch (\Throwable $th) {
            return false;
        }
    }
    public function inserirUsuario($nome, $email, $senha)
    {
        $sql = "INSERT INTO usuario SET nome = :n, email = :e, senha = :s";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":e", $email);
        $stmt->bindValue(":n", $nome);
        $stmt->bindValue(":s", $senha);

        return $stmt->execute();
    }
    public function checkUser($email)
    {
        $sql = "SELECT *FROM usuario WHERE email = :e";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":e", $email);
        $stmt->execute();

        return $stmt->rowCount() > 0;
    }
    public function checkPass($email, $senha)
    {
        $sql = "SELECT *FROM usuario WHERE email = :e AND senha = :s";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":e", $email);
        $stmt->bindValue(":s", md5($senha));
        $stmt->execute();

        return $stmt->rowCount() > 0;
    }
    public function listarUsuarios()
    {
        $sql = "SELECT * FROM usuario";
        $stmt = $this->pdo->prepare($sql);
        $stmt ->execute();
        if ($stmt->rowCount() > 0) {
            return $stmt->fetchAll();
        } else {
            return array();
        }
    }

      public function listarUsuario($id)
    {
        $sql = "SELECT * FROM usuario WHERE id = :i";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":i", $id);

        $stmt ->execute();
        if ($stmt->rowCount() > 0) {
            return $stmt->fetch();
        } else {
            return array();
        }
    }
  
    public function apagqarUsuario($id){
        $sql = "DELETE FROM usuario WHERE id = :i";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue( ":i", $id);
        return $stmt ->execute();
    }

    public function alterarUsuario( $id, $nome, $email, $senha ){
        $sql = "UPDATE usuario SET nome = :n, email = :e, senha = :s, WHERE id = :i";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":i", $id);
        $stmt->bindValue(":n", $nome);
        $stmt->bindValue(":e", $email);
        $stmt->bindValue(":s", $senha);

        return $stmt ->execute();
    }

}

?>