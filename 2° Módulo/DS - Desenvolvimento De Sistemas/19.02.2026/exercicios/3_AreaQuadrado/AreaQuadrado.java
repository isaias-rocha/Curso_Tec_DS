import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);

        scanner.close();
    };
};
