package ex15_LerNumero;
public class Function {

    // Arrays com a escrita por extenso
    private final String[] UNIDADES = {
        "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
        "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private final String[] DEZENAS = {
        "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    /**
     * Converte um número de 0 a 99 para sua representação por extenso.
     */
    public String converterPorExtenso(int numero) {
        // Validação do intervalo solicitado
        if (numero < 0 || numero > 99) {
            return "Número inválido! Por favor, digite um valor entre 0 e 99.";
        }

        // Casos de 0 a 19 (possuem nomes únicos)
        if (numero < 20) {
            return UNIDADES[numero];
        }

        // Casos de 20 a 99
        int dezena = numero / 10;
        int unidade = numero % 10;

        if (unidade == 0) {
            return DEZENAS[dezena];
        } else {
            return DEZENAS[dezena] + " e " + UNIDADES[unidade];
        }
    }
}