
public class AmortizationCalculator {

    public static double[] calcularAmortizacao(double valorTotal, double taxaJuros, int numParcelas) {
        double[] parcelas = new double[numParcelas];
        double taxaMensal = taxaJuros / 12;  // Convertendo a taxa de juros para mensal

        
        double parcelaFixa = (valorTotal * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -numParcelas));

      
        for (int i = 0; i < numParcelas; i++) {
            parcelas[i] = parcelaFixa;
        }

        return parcelas;
    }
}
