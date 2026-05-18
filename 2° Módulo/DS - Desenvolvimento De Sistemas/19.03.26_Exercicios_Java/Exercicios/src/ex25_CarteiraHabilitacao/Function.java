package ex25_CarteiraHabilitacao;

public class Function {
    public String autorizacaoDirigir(int idade, boolean temHabilitacao) {
        
        if (idade >= 18 && temHabilitacao) {
            return "Permissão CONCEDIDA para dirigir.";
        } else {
            return "Permissão NEGADA para dirigir. \nMotivo: Falta de maioridade legal ou ausência de CNH.";
        }
    }
}