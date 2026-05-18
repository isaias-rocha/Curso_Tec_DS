package ex22_SalarioImposto;

public class Function {

    public String calcularImposto(double salario) {
        if (salario <= 2000) {
            return "Isento de imposto.";
        } 
        else if (salario <= 3000) {
            double imposto = salario * 0.10;
            return "Alíquota de 10%. Valor do imposto: R$ " + imposto;
        } 
        else {
            double imposto = salario * 0.15;
            return "Alíquota de 15%. Valor do imposto: R$ " + imposto;
        }
    }
}