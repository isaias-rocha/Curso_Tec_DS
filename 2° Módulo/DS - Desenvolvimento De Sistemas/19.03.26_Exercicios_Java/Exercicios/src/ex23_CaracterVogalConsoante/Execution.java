package ex23_CaracterVogalConsoante;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        String resultado = sistema.verificarVogalConsoante(caractere);
        System.out.println(resultado);

        scanner.close();
    }
}