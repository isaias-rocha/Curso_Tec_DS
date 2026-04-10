package Senha;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = leia.nextInt();

        if (senha == 123)
            System.out.println("Senha inválida");
        else if (senha == 'a') {
            System.out.println("Senha inválida");
        } else
            System.out.println("Senha válida");
    }
}