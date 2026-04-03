import java.util.Scanner;

public class AulaScanner {
    public static void main (String [] args) {

        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do Cliente: ");
        nome = sc.next();

        System.out.println("Seu nome é: " + nome);
    }
}