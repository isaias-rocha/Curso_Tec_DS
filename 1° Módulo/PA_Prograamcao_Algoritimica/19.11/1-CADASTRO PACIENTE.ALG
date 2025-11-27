Algoritmo "1-Cadastro Paciente"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/11/2025
Var
nome, planoSaude, fim: caracter
idade, planoSaudeS, planoSaudeN, quantosTem, quantosNao, totalPacientes: inteiro


Inicio

totalPacientes <- 0
planoSaudeS <- 0
planoSaudeN <- 0


EscrevaL ("=== Cadastro de Pacientes ===")

EscrevaL ("Digite o nome do paicente: (ou digite FIM para encerrar) :")
         Leia (nome)

Enquanto (nome <> "FIM") faca

         EscrevaL ("Digite sua idade: ")
                  Leia (idade)

         EscrevaL ("Você tem plano de saúde? (S/N) ")
                  Leia (planoSaude)

totalPacientes <- totalPacientes + 1

              se (planoSaude = "S") ou (planoSaude = "N")entao

                      planoSaudeS <- planoSaudeS + 1

              senao
                      planoSaudeN  <- planoSaudeN + 1

              fimse


              EscrevaL("Digite as informações do próximo paciente (ou digite FIM para encerrar): ")
                  Leia (nome)

Fimenquanto

 EscrevaL("===== RELATÓRIO =====")

EscrevaL ("O total de pacientes são de: ", totalPacientes)
EscrevaL ("Pacientes que têm o plano: ", planoSaudeS)
EscrevaL ("Pacientes que não têm o plano: ", planoSaudeN)

Fimalgoritmo