package ex17_Triangulo;

public class Function {
    public String classificarTriangulo(double l1, double l2, double l3) {
        // Validação se os lados realmente formam um triângulo
        if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
            return "Os lados informados não formam um triângulo válido.";
        }
        
        if (l1 == l2 && l2 == l3) {
            return "Triângulo Equilátero (todos os lados iguais).";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            return "Triângulo Isósceles (dois lados iguais).";
        } else {
            return "Triângulo Escaleno (todos os lados diferentes).";
        }
    }
}