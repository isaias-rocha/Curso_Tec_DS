package ex21_NumeroEntre10e50;

public class Function {
    public String verificarIntervalo(int numero) {
        if (numero >= 10 && numero <= 50) {
            return "O número " + numero + " ESTÁ entre 10 e 50.";
        } else {
            return "O número " + numero + " NÃO ESTÁ entre 10 e 50.";
        }
    }
}