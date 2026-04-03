import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

    String nome;
    Double saldoBancario;
    int contaCorrente;
    int agenciaBancaria;


        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Nome do Cliente: ");
                nome = sc.next();
            
            System.out.println("Digite o número da Agência bancária (04 Dígitos): ");
             agenciaBancaria = sc.nextInt();
            
            System.out.println("Digite o número da Conta Corrente (04 Dígitos): ");
                contaCorrente = sc.nextInt();

            System.out.println("Digite o saldo que queira depositar: R$ ");
                saldoBancario = sc.nextDouble();

        sc.close();

             System.out.println("----- Dados do Cliente -----");

                System.out.println("Sr(a) : " + nome);
                System.out.println("Número da Conta Corrente:" + contaCorrente);
                System.out.println("Número da Agência Bancária: " + agenciaBancaria);
                System.out.println("Valor do saldo atual é:  " + saldoBancario);
    }
}
