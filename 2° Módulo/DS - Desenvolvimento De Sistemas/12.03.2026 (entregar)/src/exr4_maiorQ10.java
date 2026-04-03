import java.util.Scanner;
public class exr4_maiorQ10 {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Informe um numero inteiro: ");
     int numero = scan.nextInt();

    if (numero > 10) {
        System.out.println("Seu número é: " + numero + " é maior que 10.");        
    }else if (numero < 10) {
        System.out.println("Seu número é: " + numero + " é menor que 10.");      
    }else{
        System.out.println("Seu número é: "+ numero);
    }scan.close();}}
