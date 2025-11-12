Algoritmo "Sucessor e Antecessor Númerico"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Isaias Rocha De Jesus
// RM          : 3642
// Data atual  : 05/11/2025




//  Escreva um algoritmo para ler um valor (informado pelo teclado)
// e escrever (na tela)  sucessor e o seu antecessor.

Var
numero, antecessor, sucessor: inteiro

Inicio

      EscrevaL ("Digite um numero: ")
         Leia (numero)
         
      sucessor <- numero + 1
      antecessor <- numero - 1

      EscrevaL ("O número sucessor de :", numero, " -> ", sucessor)
      EscrevaL ("O número antecessor de :", numero, " -> ", antecessor)

Fimalgoritmo