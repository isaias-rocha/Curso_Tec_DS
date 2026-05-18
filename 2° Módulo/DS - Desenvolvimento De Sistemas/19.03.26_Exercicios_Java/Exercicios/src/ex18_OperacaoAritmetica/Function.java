package ex18_OperacaoAritmetica;

public class Function {
    public String calcular(double n1, double n2, char operacao) {
        switch (operacao) {
            case '+': return "Resultado: " + (n1 + n2);
            case '-': return "Resultado: " + (n1 - n2);
            case '*': return "Resultado: " + (n1 * n2);
            case '/': 
                return (n2 == 0) ? "Erro: Divisão por zero não é permitida." : "Resultado: " + (n1 / n2);
            default: return "Operação inválida! Use apenas +, -, * ou /.";
        }
    }
}