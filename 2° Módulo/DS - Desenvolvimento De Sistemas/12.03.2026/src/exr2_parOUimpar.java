import java.util.Scanner;
public class exr2_parOUimpar {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe um numero: ");
    int numero = scan.nextInt();

    if (numero % 2 == 0 ) {
        System.out.println("Seu numero é par.");    
    }else if(numero % 2 != 0) {
        System.out.println("Seu número é ímpar.");
        
    }else{

    }
    scan.close();}}
