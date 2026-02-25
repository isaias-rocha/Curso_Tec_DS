import java.util.Scanner;

public class ArestaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a área do quadrado: ");
        double area = scanner.nextDouble();

        double lado = Math.sqrt(area);
        System.out.println("Aresta (lado) do quadrado: " + lado);

        scanner.close();
    }
}