package ex21_NumeroEntre10e50;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = sistema.verificarIntervalo(numero);
        System.out.println(resultado);

        scanner.close();
    }
}