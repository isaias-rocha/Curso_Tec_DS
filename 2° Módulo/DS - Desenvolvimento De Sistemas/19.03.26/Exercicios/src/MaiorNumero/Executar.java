package MaiorNumero;

import java.util.Scanner;

public class Executar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° numero: ");
        int number1 = sc.nextInt();

        System.out.println("Digite o 2° numero: ");
        int number2 = sc.nextInt();

        System.out.println("Digite o 3° numero: ");
        int number3 = sc.nextInt();


        if ((number1 > number2) && (number1 > number3)) {
            System.out.println("O maior numero é: " + number1);
        } else if ((number2 > number1) && (number2 > number3)) {
            System.out.println("O maior numero é: " + number2);

        } else if ((number3 > number1) && (number3 > number2)) {
            System.out.println("O maior numero é: " + number3);
        }
    }
}