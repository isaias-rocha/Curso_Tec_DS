package ex23_CaracterVogalConsoante;

public class Function {
    public String verificarVogalConsoante(char ch) {
        ch = Character.toLowerCase(ch);
        
        if (!Character.isLetter(ch)) {
            return "O caractere informado não é uma letra.";
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "O caractere '" + ch + "' é uma VOGAL.";
        } else {
            return "O caractere '" + ch + "' é uma CONSOANTE.";
        }
    }
}