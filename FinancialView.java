

import java.util.Scanner;

public class FinancialView {
    private Scanner scanner;

    public FinancialView() {
        this.scanner = new Scanner(System.in);
    }

  
    public double[] solicitarFluxosDeCaixa() {
        int anos = 5; 
        double[] fluxosDeCaixa = new double[anos];
        
        System.out.println("Digite os fluxos de caixa para os próximos 5 anos:");
        for (int i = 0; i < anos; i++) {
            System.out.print("Fluxo de caixa do ano " + (i + 1) + ": ");
            fluxosDeCaixa[i] = scanner.nextDouble();
        }
        return fluxosDeCaixa;
    }

    public double solicitarTaxaDeDesconto() {
        System.out.print("Digite a taxa de desconto: ");
        return scanner.nextDouble();
    }

    public void exibirResultadoTabela(double val, double tir, int payback, double[] amortizacao) {
        System.out.println("\n+--------------------------+----------------------------+");
        System.out.println("| Cálculo                  | Valor                      |");
        System.out.println("+--------------------------+----------------------------+");
        System.out.printf("| VAL                      | %.2f                      |\n", val);
        System.out.printf("| TIR                      | %.2f%%                     |\n", tir * 100);
        System.out.printf("| Payback                  | %d anos                    |\n", payback);

        System.out.println("+--------------------------+----------------------------+");
        System.out.println("| Amortização (Parcelas)    | Valor                      |");
        System.out.println("+--------------------------+----------------------------+");
        for (int i = 0; i < amortizacao.length; i++) {
            System.out.printf("| Parcela %d                | %.2f                      |\n", i + 1, amortizacao[i]);
        }
        System.out.println("+--------------------------+----------------------------+");
    }
}
