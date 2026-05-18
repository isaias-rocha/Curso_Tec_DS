package ex16_TipoCaracter;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function funcao = new Function();

        System.out.print("Digite um caractere qualquer: ");
        String entrada = scanner.next();

        // Extrai apenas o primeiro caractere caso o usuário digite uma palavra
        char caractere = entrada.charAt(0);

        // Executa a validação através da classe Function
        String resultado = Function.identificarCaractere(caractere);

        // Exibe o resultado
        System.out.println(resultado);

        scanner.close();
    }
}