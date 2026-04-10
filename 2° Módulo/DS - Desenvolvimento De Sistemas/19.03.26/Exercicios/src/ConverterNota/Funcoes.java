package ConverterNota;
import javax.swing.JOptionPane;

public class Funcoes {

    void NotaFinal() {

        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota1: "));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota2: "));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota3: "));
        int res = nota1 + nota2 + nota3;

        
        if (res >= 90) { //A
            JOptionPane.showMessageDialog(null, "Resultado: A");
        }
        else if (res >= 80) { //B
            JOptionPane.showMessageDialog(null, "Resultado: B");
        }
        else if (res >= 70) {//C
            JOptionPane.showMessageDialog(null, "Resultado: C");
        }
        else if (res < 70) {//D
            JOptionPane.showMessageDialog(null, "Resultado: D");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
    