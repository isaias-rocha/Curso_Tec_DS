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