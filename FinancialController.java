

public class FinancialController {
    private FinancialView view;

    public FinancialController(FinancialView view) {
        this.view = view;
    }

    public void processarCálculos() {
        
        double[] fluxosDeCaixa = view.solicitarFluxosDeCaixa();
        double taxaDeDesconto = view.solicitarTaxaDeDesconto();

     
        double val = ValCalculator.calcularVAL(fluxosDeCaixa, taxaDeDesconto);

        double tir = TirCalculator.calcularTIR(fluxosDeCaixa);

     
        int payback = PaybackCalculator.calcularPayback(fluxosDeCaixa);

    
        double[] amortizacao = AmortizationCalculator.calcularAmortizacao(10000, 0.05, 10);

       
        view.exibirResultadoTabela(val, tir, payback, amortizacao);
    }
}
