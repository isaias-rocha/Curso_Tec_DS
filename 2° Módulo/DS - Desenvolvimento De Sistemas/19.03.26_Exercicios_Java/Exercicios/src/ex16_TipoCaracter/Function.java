package ex16_TipoCaracter;
public class Function {

    /**
     * Analisa o caractere e determina sua categoria.
     */
    public static String identificarCaractere(char ch) {
        if (Character.isLetter(ch)) {
            return "O caractere '" + ch + "' é uma LETRA.";
        } 
        else if (Character.isDigit(ch)) {
            return "O caractere '" + ch + "' é um NÚMERO.";
        } 
        else if (Character.isWhitespace(ch)) {
            return "O caractere digitado é um ESPAÇO em branco.";
        } 
        else {
            // Se não for letra, número, espaço, é um símbolo
            return "O caractere '" + ch + "' é um SÍMBOLO.";
        }
    }
}