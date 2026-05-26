<?php

require_once 'conexao.php';

// ═══════════════════════════════════════════════
//  PASSO 1 — Responde sempre em JSON (sem HTML)
// ═══════════════════════════════════════════════
header('Content-Type: application/json; charset=utf-8');

// ═══════════════════════════════════════════════
//  PASSO 2 — Garante que veio de um formulário
// ═══════════════════════════════════════════════
if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    http_response_code(405);
    exit(json_encode(['sucesso' => false, 'erro' => 'Envie os dados via formulário (POST).']));
}

// ═══════════════════════════════════════════════
//  PASSO 3 — Lê os campos e valida
// ═══════════════════════════════════════════════
$email = trim($_POST['email'] ?? '');
$senha = trim($_POST['senha'] ?? '');

$erros = [];

if ($email === '')                                      $erros[] = 'O campo "e-mail" não pode ficar vazio.';
elseif (!filter_var($email, FILTER_VALIDATE_EMAIL))    $erros[] = 'O e-mail informado é inválido.';
if ($senha === '')                                      $erros[] = 'O campo "senha" não pode ficar vazio.';

if ($erros) {
    http_response_code(422);
    exit(json_encode(['sucesso' => false, 'erros' => $erros]));
}

// ═══════════════════════════════════════════════
//  PASSO 4 — Busca o usuário pelo e-mail
// ═══════════════════════════════════════════════
try {
    $pdo->exec('USE `' . DB_NAME . '`');

    $stmt = $pdo->prepare('SELECT id, nome, email, senha FROM `usuarios` WHERE email = :email');
    $stmt->execute([':email' => $email]);
    $usuario = $stmt->fetch(PDO::FETCH_ASSOC);

// ═══════════════════════════════════════════════
//  PASSO 5 — Verifica a senha
// ═══════════════════════════════════════════════
    if (!$usuario || !password_verify($senha, $usuario['senha'])) {
        http_response_code(401);
        exit(json_encode(['sucesso' => false, 'erros' => ['E-mail ou senha incorretos.']]));
    }

// ═══════════════════════════════════════════════
//  PASSO 6 — Retorna sucesso
// ═══════════════════════════════════════════════
    echo json_encode([
        'sucesso'  => true,
        'mensagem' => 'Login realizado com sucesso!',
        'usuario'  => [
            'id'    => (int) $usuario['id'],
            'nome'  => $usuario['nome'],
            'email' => $usuario['email'],
        ],
    ]);

} catch (PDOException $e) {
    http_response_code(500);
    echo json_encode(['sucesso' => false, 'erro' => $e->getMessage()]);
}
