package ex18_OperacaoAritmetica;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        String resultado = sistema.calcular(n1, n2, op);
        System.out.println(resultado);

        scanner.close();
    }
}