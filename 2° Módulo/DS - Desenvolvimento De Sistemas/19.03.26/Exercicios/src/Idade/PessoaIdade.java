package Idade;
import java.util.Scanner;

public class PessoaIdade {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();


        if ((idade >= 1) && (idade < 18)) {
            System.out.println(idade + " -> Menor de idade");
        }
        else if ((idade >= 18) && (idade < 59)){
            System.out.println(idade + " -> Adulto");
            
        }
        else if (idade >= 60) {
            System.out.println(idade + " -> Idoso");
            
        }
        else  {
            System.out.println("Erro!");
        }
    }
}
