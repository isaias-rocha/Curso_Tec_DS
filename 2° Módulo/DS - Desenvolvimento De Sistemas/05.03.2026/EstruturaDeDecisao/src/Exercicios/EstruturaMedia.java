package Exercicios;
import java.util.Scanner;

public class EstruturaMedia {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


    double media = 3.9;

        if (media > 7.5) {
            System.out.println(media + " -> Aprovado!");
        } 
        else if((media >= 6) && (media < 7.5)){
            System.out.println(media + " -> Fazer um trabalho!");
        } 
        else if((media >= 5) && (media < 6)){
            System.out.println(media + " -> Recuperação!");
        } 
        else if((media >= 4) && (media < 5)){
            System.out.println(media + " -> Reprovado!");
        } 
        else if((media < 4) && (media >= 0)){
            System.out.println(media + " -> Rebaixado para o ano anterior!");
        } 
        else  {
           System.out.println(" Reiniciar tudo");
        }
        
    
     scanner.close();
    }
}