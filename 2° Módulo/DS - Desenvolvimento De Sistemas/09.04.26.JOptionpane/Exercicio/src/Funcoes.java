import javax.swing.JOptionPane;

public class Funcoes {

       public void Somar(){
         double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro"));
         double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo"));
         double res = num1 + num2;
        JOptionPane.showMessageDialog(null, "Resultado" + res);
    }
    

     public void Subtrair(){
         double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro"));
         double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo"));
         double res = num1 - num2;
        JOptionPane.showMessageDialog(null, "Resultado" + res);
    }


       public void Multiplicar(){
         double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro"));
         double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo"));
         double res = num1 * num2;
        JOptionPane.showMessageDialog(null, "Resultado" + res);
    }



     public void Dividir(){
         double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro"));
         double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo"));
         double res = num1 / num2;

         if (res == 0) {
                JOptionPane.showMessageDialog(null, "Erro de Resultado!");
         }
         else {
                JOptionPane.showMessageDialog(null, "Resultado: " + res);
         }
         
    }
}