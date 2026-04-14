<?php
//configuração - altere apenas estas 4 linhas
define ('DB_HOST', 'localhost');
define ('DB_USER', 'root');
define ('DB_PASS', '');
define ('DB_NAME', 'cadastro');

$pdo = new PDO('mysql:host=' . DB_HOST, DB_USER, DB_PASS);
$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
