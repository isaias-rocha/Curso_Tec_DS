package IMC;
import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        // Instancia a classe de funções para poder usar os métodos dela
        Funcoes ferramentas = new Funcoes();

        try {
            String strPeso = JOptionPane.showInputDialog("Digite seu peso (ex: 80.5):");
            String strAltura = JOptionPane.showInputDialog("Digite sua altura (ex: 1.80):");

            double peso = Double.parseDouble(strPeso);
            double altura = Double.parseDouble(strAltura);

            // Chama as funções da outra classe
            double imcResultado = ferramentas.calcularIMC(peso, altura);
            String classificacao = ferramentas.classificarIMC(imcResultado);

            // Exibe o resultado final   -  %.2f aredondar para 2casas decimais  - \n quebra de linha
            String mensagem = String.format("Seu IMC é: %.2f \n Classificação: %s", imcResultado, classificacao);
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Use apenas números e ponto.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
