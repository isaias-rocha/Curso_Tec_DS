package ex24_MesFerias;

public class Function {
    public String verificarMesFerias(int mes) {
        if (mes == 1 || mes == 7 || mes == 12) {
            return "O mês " + mes + " É mês de férias!";
        } else if (mes >= 1 && mes <= 12) {
            return "O mês " + mes + " NÃO É mês de férias.";
        } else {
            return "Mês inválido! Digite um número válido de 1 a 12.";
        }
    }
}