import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        
        Funcoes function = new Funcoes();

    
        int operacoes = Integer.parseInt(JOptionPane.showInputDialog(
        ("Digite a operação: [1- adicao] [2- subtracao] [3- multiplicacao] [4- divisao]")));

        if (operacoes == 1) {
            function.Somar();
        }

        else if (operacoes == 2) {
            function.Subtrair();
        } 

        else if (operacoes == 3) {
            function.Multiplicar();
        } 

        else if (operacoes == 4) {
            function.Dividir();
        }    
    }

}
