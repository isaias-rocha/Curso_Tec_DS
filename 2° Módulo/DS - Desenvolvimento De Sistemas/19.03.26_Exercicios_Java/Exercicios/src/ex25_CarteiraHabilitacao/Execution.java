package ex25_CarteiraHabilitacao;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Possui carteira de habilitação? (true / false): ");
        boolean cnh = scanner.nextBoolean();

        String resultado = sistema.autorizacaoDirigir(idade, cnh);
        System.out.println(resultado);

        scanner.close();
    }
}