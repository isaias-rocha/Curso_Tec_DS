package DiaSemana;
import javax.swing.JOptionPane;

public class Funcoes {


void DiaSemana() {
    // Criamos uma lista com os nomes dos dias (o índice 0 fica vazio ou com erro)
    String[] dias = {"Inválido", "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};

    int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia da semana pelo número 1-7: "));

    // Validamos se o número está no intervalo correto antes de exibir
    if (num >= 1 && num <= 7) {
        JOptionPane.showMessageDialog(null, "O dia é: " + dias[num]);
    } else {
        JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
        }
    }
}