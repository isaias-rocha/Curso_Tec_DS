package ex15_LerNumero;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function funcao = new Function();

        System.out.print("Digite um número inteiro de 0 a 99: ");
        
        // Verifica se a entrada é realmente um número inteiro
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            
            // Chama o método da classe Function e armazena o retorno
            String resultado = funcao.converterPorExtenso(numero);
            
            System.out.println("Por extenso: " + resultado);
        } else {
            System.out.println("Erro: Você não digitou um número inteiro válido.");
        }

        scanner.close();
    }
}