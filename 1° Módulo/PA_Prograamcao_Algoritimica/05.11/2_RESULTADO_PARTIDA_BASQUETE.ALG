Algoritmo "Calculo do resultado da partida de basquete"
// P.A - Programação Algoritimica
// Professor   :Jonathas / Sueli
// Autor(a)    : Isaias Rocha De Jesus
// RM          : 3642
// Data atual  : 05/11/2025


// Descrição: 2) Escreva um algoritmo que calculará resultado de
//uma partida de basquete.

//O usuário deve informar o nome da duas equipes;
//A quantidade de cestas de cada equipe;

// Se a partida teve vencedor, informar o nome da equipe que venceu,
//a quantidade de cestas;

//Se não teve vencedor, devolver uma mensagem avisado que
// a partida terminou empatada.


//**Considerar que todas as cestas tiveram a mesma pontuação,
//portanto a quantidade de cestas é suficiente para determinar o resultado.


Var
equipe1, equipe2: caracter
cestaEquipe1, cestaEquipe2: inteiro


Inicio

EscrevaL ("====== Resultado da Partida de basquete ======")

EscrevaL ("informe o nome da primeira equipe:")
         Leia(equipe1)
EscrevaL ("informe o nome da segunda equipe:")
         Leia(equipe2)
               
EscrevaL ("informe a quantidade de cestas pontualizadas pela primeira equipe: ")
         Leia (cestaEquipe1)
EscrevaL ("informe a quantidade de cestas pontualizadas pela segunda equipe: ")
      Leia (cestaEquipe2)
               
               

se (cestaEquipe1 > cestaEquipe2) entao
        escreva("A equipe vencedora é: ", equipe1, " com ", cestaEquipe1, " cestas.")
        senao

se (cestaEquipe2 > cestaEquipe1) entao
        escreva("A equipe vencedora é: ", equipe2, " com ", cestaEquipe2, " cestas.")
        senao
   
escreva("A partida terminou empatada com: ", cestaEquipe1, " cestas para cada equipe.")

     fimse
fimse

Fimalgoritmo