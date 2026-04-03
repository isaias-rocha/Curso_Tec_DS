import java.util.Scanner;

public class NumeroEntre1e100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 100) {
            System.out.println("O número está entre 1 e 100.");
        } else {
            System.out.println("O número NÃO está entre 1 e 100.");
        }

        scanner.close();
    }
}