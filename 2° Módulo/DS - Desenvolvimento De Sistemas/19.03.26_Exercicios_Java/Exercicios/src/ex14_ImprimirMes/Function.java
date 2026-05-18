package ex14_ImprimirMes;
import javax.swing.JOptionPane;

public class Function {

void Meses() {
    // Criamos uma lista com os nome dos mes (o índice 0 fica vazio ou com erro)
    String[] mes = {"Inválido", "Janeiro", "Fevereiro-", "Marco", "Abril", "Maio", "Junho",
     "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezenbro"};

    int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês pelo número 1-12: "));

    // Validamos se o número está no intervalo correto antes de exibir
    if (num >= 1 && num <= 12) {
        JOptionPane.showMessageDialog(null, "O Mês é: " + mes[num]);
    } else {
        JOptionPane.showMessageDialog(null, "Número fora do intervalo!");
        }
    }
}