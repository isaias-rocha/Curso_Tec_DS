package ex19_CalculoPassagem;

public class Function {
    public String verificarFaixaEtaria(int idade) {
        if (idade < 0) return "Idade inválida.";
        if (idade <= 12) return "Faixa etária: Criança.";
        if (idade <= 17) return "Faixa etária: Jovem.";
        if (idade <= 59) return "Faixa etária: Adulto.";
        return "Faixa etária: Idoso.";
    }
}