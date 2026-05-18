package ex24_MesFerias;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function sistema = new Function();

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        String resultado = sistema.verificarMesFerias(mes);
        System.out.println(resultado);

        scanner.close();
    }
}