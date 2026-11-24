package BLOCK5.lab22_2_mirea;
public class CalculatorController {
    public CalculatorController(RpnCalculator model, CalculatorView view) {
        view.onCalculate(event -> {
            try {
                double result = model.calculate(view.getExpression());
                view.showResult("Результат: " + result);
            } catch (IllegalArgumentException e) {
                view.showError(e.getMessage());
            }
        });
    }
}