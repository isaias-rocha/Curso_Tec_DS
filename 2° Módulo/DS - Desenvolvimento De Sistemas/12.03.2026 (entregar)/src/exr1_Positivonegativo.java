
import java.util.Scanner;
public class exr1_Positivonegativo {
    
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);

        System.out.println("Inseria um número: ");
        int numero = scan.nextInt();
       
        if (numero > 0) {
            System.out.println("Número é positivo!");
        }else if (numero < 0) {
            System.out.println("Número negativo!");
        }else if (numero == 0) {
            System.out.println("Número Neutro!");    
        }else{

        }

     scan.close();
    }
}
