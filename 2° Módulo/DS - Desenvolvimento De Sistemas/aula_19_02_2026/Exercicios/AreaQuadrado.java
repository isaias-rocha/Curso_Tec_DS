import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o valor do lado do quadrado
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = scanner.nextDouble();

            // Validação: lado não pode ser negativo
            if (lado < 0) {
                System.out.println("O valor do lado não pode ser negativo.");
            } else {
                // Calcula a área
                double area = lado * lado;

                // Exibe o resultado
                System.out.printf("A área do quadrado é: %.2f\n", area);
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}