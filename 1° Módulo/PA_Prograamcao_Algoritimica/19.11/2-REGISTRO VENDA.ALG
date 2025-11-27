Algoritmo "2-Registro Venda"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/11/2025


Var
   totalVenda, quantVenda: inteiro
   vlrVenda, medVenda, totalArrecadado: real
   fim: caracter

Inicio
   Enquanto (fim <> "0") faca

      EscrevaL("Digite a quantidade de cada venda realizada hoje: ")
      leia (quantVenda)

      EscrevaL("Digite o valor da venda: ")
      leia (vlrVenda)

      totalVenda <- totalVenda + quantVenda

      totalArrecadado <- totalVenda + vlrVenda


      EscrevaL("Para encerrar digite número: 0")
      Leia (fim)

   Fimenquanto

   medVenda <- totalArrecadado / totalVenda


   EscrevaL ("")
   EscrevaL("-----------------------------")

   EscrevaL ("Total arrecadado R$: ", totalArrecadado)
   EscrevaL ("Quantidade de Vendas: ", quantVenda)
   EscrevaL ("A média das Vendas: ", medVenda)


Fimalgoritmo