
public class PaybackCalculator {

    public static int calcularPayback(double[] fluxosDeCaixa) {
        double fluxoAcumulado = 0;
        int ano = 0;
        
        while (fluxoAcumulado < 0 && ano < fluxosDeCaixa.length) {
            fluxoAcumulado += fluxosDeCaixa[ano];
            ano++;
        }
        
        return ano;
    }
}
