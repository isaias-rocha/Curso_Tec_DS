import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2_Op_Aritimeticas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            /* Entrada do Primeiro Número */
            System.out.println("Digite o primeiro numero: ");
            double num1 = scanner.nextDouble();

            /* Entrada do Segundo Número */
            System.out.println("Digite o segundo numero: ");
            double num2 = scanner.nextDouble();

            /* Operações */
            System.out.println("\nResultadoss:");
            System.out.println("Soma: " + (num1 + num2));
            System.out.println("Subtracao: " + (num1 - num2));
            System.out.println("Multiplicacao: " + (num1 * num2));
            System.out.println("Divisao: " + (num1 / num2));

            /*  Tratamento de divisao por zero */
            if (num2 != 0) {
                System.out.println("Divisão: " + (num1 / num2));
            } else {
                System.out.println("Divisão: Erro - não é possível dividir por zero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        } finally {
            scanner.close();
        }
    }
}