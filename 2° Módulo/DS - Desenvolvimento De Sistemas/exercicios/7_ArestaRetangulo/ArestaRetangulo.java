import java.util.Scanner;

public class ArestaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a área do retângulo: ");
        double area = scanner.nextDouble();

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        double altura = area / base;
        System.out.println("Aresta (altura) do retângulo: " + altura);

        scanner.close();
    }

}