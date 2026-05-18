package ex19_CalculoPassagem;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        String resultado = sistema.verificarFaixaEtaria(idade);
        System.out.println(resultado);

        scanner.close();
    }
}