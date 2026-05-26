<?php
// CONSULTAR DADOS DO BANCO DE DADOS
require_once 'conexao.php';

// consultar usando campo email

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
// Consulta o banco de dados usando o campo email
// ═══════════════════════════════════════════════
$email = $_POST['email'] ?? '';
if ($email === '') {
    http_response_code(422);
    exit(json_encode(['sucesso' => false, 'erro' => 'O campo "email" é obrigatório.']));
}

try {
    $pdo->exec('USE `' . DB_NAME . '`');
    $stmt = $pdo->prepare('SELECT * FROM `cadastros` WHERE email = ?');
    $stmt->execute([$email]);
    $cadastro = $stmt->fetch(PDO::FETCH_ASSOC);

    if ($cadastro) {
        echo json_encode(['sucesso' => true, 'cadastro' => $cadastro]);
    } else {
        http_response_code(404);
        echo json_encode(['sucesso' => false, 'erro' => 'Cadastro não encontrado.']);
    }
} catch (PDOException $e) {
    http_response_code(500);
    echo json_encode(['sucesso' => false, 'erro' => 'Erro ao consultar o banco de dados: ' . $e->getMessage()]);
}

