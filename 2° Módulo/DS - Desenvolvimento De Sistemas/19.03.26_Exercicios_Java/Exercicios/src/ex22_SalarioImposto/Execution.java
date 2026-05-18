package ex22_SalarioImposto;

import java.util.Scanner;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();

        String resultado = sistema.calcularImposto(salario);
        System.out.println(resultado);

        scanner.close();
    }
}