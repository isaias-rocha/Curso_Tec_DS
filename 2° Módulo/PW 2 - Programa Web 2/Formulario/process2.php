<?php
// ═══════════════════════════════════════════════
//  CONFIGURAÇÃO — altere apenas estas 4 linhas
// ═══════════════════════════════════════════════
define('DB_HOST',  'localhost');
define('DB_USER',  'root');
define('DB_PASS',  '');
define('DB_NAME',  'cadastro');

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
$campos = array_map('trim', $_POST); // remove espaços em branco
$erros  = [];

foreach ($campos as $nome => $valor) {
    if ($valor === '') {
        $erros[] = "O campo \"$nome\" não pode ficar vazio.";
    }
}

if (isset($campos['email']) && !filter_var($campos['email'], FILTER_VALIDATE_EMAIL)) {
    $erros[] = 'O e-mail informado é inválido.';
}

if ($erros) {
    http_response_code(422);
    exit(json_encode(['sucesso' => false, 'erros' => $erros]));
}

// ═══════════════════════════════════════════════
//  PASSO 4 — Conecta ao MySQL e cria o banco
// ═══════════════════════════════════════════════
try {
    $pdo = new PDO('mysql:host=' . DB_HOST, DB_USER, DB_PASS);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Cria o banco de dados se ainda não existir
    $pdo->exec('CREATE DATABASE IF NOT EXISTS `' . DB_NAME . '` CHARACTER SET utf8mb4');
    $pdo->exec('USE `' . DB_NAME . '`');

// ═══════════════════════════════════════════════
//  PASSO 5 — Cria a tabela se ainda não existir
// ═══════════════════════════════════════════════
    $pdo->exec('CREATE TABLE IF NOT EXISTS `cadastros` (
        id        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        criado_em DATETIME DEFAULT CURRENT_TIMESTAMP
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4');

// ═══════════════════════════════════════════════
//  PASSO 6 — Adiciona colunas novas automaticamente
//  (cada campo do formulário vira uma coluna)
// ═══════════════════════════════════════════════
    $colunas_existentes = $pdo->query('SHOW COLUMNS FROM `cadastros`')->fetchAll(PDO::FETCH_COLUMN);

    foreach (array_keys($campos) as $campo) {
        $coluna = preg_replace('/[^a-zA-Z0-9_]/', '_', $campo); // só letras, números e _
        if (!in_array($coluna, $colunas_existentes)) {
            $pdo->exec('ALTER TABLE `cadastros` ADD COLUMN `' . $coluna . '` VARCHAR(500)');
        }
    }

// ═══════════════════════════════════════════════
//  PASSO 7 — Salva os dados no banco
// ═══════════════════════════════════════════════
    $colunas = array_map(fn($c) => '`' . preg_replace('/[^a-zA-Z0-9_]/', '_', $c) . '`', array_keys($campos));
    $binds   =  array_map(fn($c) => ':' . preg_replace('/[^a-zA-Z0-9_]/', '_', $c), array_keys($campos));
    $valores = array_combine($binds, array_values($campos));

    $sql  = 'INSERT INTO `cadastros` (' . implode(', ', $colunas) . ') VALUES (' . implode(', ', $binds) . ')';
    $stmt = $pdo->prepare($sql);
    $stmt->execute($valores);

// ═══════════════════════════════════════════════
//  PASSO 8 — Retorna sucesso
// ═══════════════════════════════════════════════
    echo json_encode([
        'sucesso'  => true,
        'mensagem' => 'Cadastro salvo com sucesso!',
        'id'       => (int) $pdo->lastInsertId(),
    ]);

} catch (PDOException $e) {
    http_response_code(500);
    echo json_encode(['sucesso' => false, 'erro' => $e->getMessage()]);
}