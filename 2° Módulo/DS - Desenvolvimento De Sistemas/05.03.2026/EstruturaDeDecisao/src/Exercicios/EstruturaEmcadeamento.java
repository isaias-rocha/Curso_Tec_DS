package Exercicios;

public class EstruturaEmcadeamento {
    public static void main(String[] args) {
        
        int idade = 17;


         if (idade >= 18) {
        System.out.println("Maior de idade ! ");
    }  
        else if((idade > 0 ) && (idade < 18)){
        System.out.println("Menor de idade!");
    } else {
        System.out.println("Digite uma idade válida! ");
    }

    
        
    }
}
