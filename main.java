
public class main {
    public static void main(String[] args) {
        FinancialView view = new FinancialView();
        FinancialController controller = new FinancialController(view);
        controller.processarCálculos();
    }
}
