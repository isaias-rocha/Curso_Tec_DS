import java.util.Scanner;
public class exr3_media {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
System.out.println("Informe Duas notas para calcular sua Média: ");
double nota1 = scan.nextDouble();
double nota2 = scan.nextDouble();
double media = (nota1 + nota2)/2;
System.out.println("Sua média é: "+ media);
if (media >= 7) {
    System.out.println("Aprovado!");
    
}else if (media < 7) {
    System.out.println("Reprovado!");
    
}
scan.close();}}
