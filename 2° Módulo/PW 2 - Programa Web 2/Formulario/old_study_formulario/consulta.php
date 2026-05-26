<?php //começa a interpreta
require_once 'conexao.php';

//PASSO 1 - Responde sempre em JSON (sem HTML)
header ('Content-Type: application/json; charset=utf-8');//definindo o tipo de codificação que vai ser usado 

//PASSO 2 - Garante que veio de um formulário
if($_SERVER['REQUEST_METHOD'] !== 'POST'){//POST METEDO DE PROTOCOLO http
    http_reponse_code(405);
    exit(json_encode(['sucesso' => false, 'erro' =>'Envie os dados via formulário (POST).']));
}
$email = $_POST['email'] ?? '';
if ($email === '') {
    http_response_code(422);
    exit(json_encode(['sucesso' => false, 'erro' => 'O campo "email" é obrigatório']));
}

try{
    $pdo ->exec('USE `' . DB_NAME . '`');
    $stmt = $pdo ->prepare('SELECT * FROM `cadastros` WHERE email = ?');
    $stmt->execute([$email]);
    $cadastro = $stmt ->fetch(PDO::FETCH_ASSOC);

    if ($cadastro) {
        echo json_encode(['sucesso' => true, 'cadastro' => $cadastro]);
    }else{
        http_response_code(404);
        echo json_encode(['sucesso' => false, 'erro' => 'Cadastro não encontrado.']);
    }
} catch (PDOException $e){
    http_response_code(500);
    echo json_encode(['sucesso' => false, 'erro' => 'Erro ao consultar o banco de dados: ' . $e->getMessage()]);
}

