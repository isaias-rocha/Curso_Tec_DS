package ex17_Triangulo;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite o lado 1: ");
        double l1 = scanner.nextDouble();
        System.out.print("Digite o lado 2: ");
        double l2 = scanner.nextDouble();
        System.out.print("Digite o lado 3: ");
        double l3 = scanner.nextDouble();

        String resultado = sistema.classificarTriangulo(l1, l2, l3);
        System.out.println(resultado);

        scanner.close();
    }
}