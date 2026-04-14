package IMC;
public class Funcoes {

    // Método para calcular o valor numérico do IMC
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para retornar a classificação baseada na tabela
    public String classificarIMC(double imc) {
        if (imc < 18.5) return "Baixo peso (Abaixo do peso)";
        if (imc <= 24.9) return "Peso Adequado (Normal/Eutrófico)";
        if (imc <= 29.9) return "Sobrepeso (Pré-obesidade)";
        if (imc <= 34.9) return "Obesidade Grau I";
        if (imc <= 39.9) return "Obesidade Grau II (Severa)";
        return "Obesidade Grau III (Mórbida/Grave)";
    }
}
