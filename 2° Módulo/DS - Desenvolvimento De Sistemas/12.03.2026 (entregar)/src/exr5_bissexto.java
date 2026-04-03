import java.util.Scanner;
public class exr5_bissexto {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
System.out.println("Informe o Ano que deseja saber se é ou não bissexto: ");
int ano = scan.nextInt();
 
 if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
    System.out.println("O ano é bissexto:" + ano);
 }else{
System.out.println("O ano não é bissexto: " + ano);
 }scan.close();}}
