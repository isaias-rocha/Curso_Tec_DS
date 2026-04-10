package Produto;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = leia.nextDouble();


            if (preco > 100) {
                preco = preco - (preco * 0.10);
            }

            System.out.println("Preço final: " + preco);
        }
    }
}