
public class TirCalculator {
    
    public static double calcularTIR(double[] fluxosDeCaixa) {
        double taxa = 0.1; // Início com uma taxa de 10%
        double val = calcularVAL(fluxosDeCaixa, taxa);
        
        // Ajustar a taxa para encontrar a TIR
        double tolerancia = 0.01; // Tolerância para encontrar a TIR
        while (Math.abs(val) > tolerancia) {
            taxa += 0.001; // Incremento na taxa
            val = calcularVAL(fluxosDeCaixa, taxa);
        }
        
        return taxa;
    }
    
    private static double calcularVAL(double[] fluxosDeCaixa, double taxaDeDesconto) {
        double val = 0;
        for (int i = 0; i < fluxosDeCaixa.length; i++) {
            val += fluxosDeCaixa[i] / Math.pow(1 + taxaDeDesconto, i + 1);
        }
        return val;
    }
}
