import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();

        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println("Valor absoluto: " + numero);
    }
}
