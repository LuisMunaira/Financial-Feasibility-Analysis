

public class ValCalculator {

    public static double calcularVAL(double[] fluxosDeCaixa, double taxaDeDesconto) {
        double val = 0;
        for (int i = 0; i < fluxosDeCaixa.length; i++) {
            val += fluxosDeCaixa[i] / Math.pow(1 + taxaDeDesconto, i + 1);
        }
        return val;
    }
}
