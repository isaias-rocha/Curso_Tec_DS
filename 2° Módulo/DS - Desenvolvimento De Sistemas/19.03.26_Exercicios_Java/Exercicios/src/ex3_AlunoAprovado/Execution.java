package ex3_AlunoAprovado;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Calculo de Nota Final ===");

        System.out.println("Informe a primeira nota: ");
        int nota1 = scan.nextInt();
        System.out.println("Informe a primeira nota: ");
        int nota2 = scan.nextInt();
        
        int media = ((nota1 + nota2) / 2);


        if (media >= 7) {
            System.out.println(media + " - Aprovado");
        }
        else if (media <= 7) {
            System.out.println(media + " - Reprovado");
            
        } else {
            System.out.println("Erro!");
        }
    }
}