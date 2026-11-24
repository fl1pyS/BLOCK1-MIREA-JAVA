package BLOCK5.lab22_3_mirea;
import java.util.Stack;

public class RpnCalculator {
    public double calculate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Введите выражение.");
        }
        Stack<Double> stack = new Stack<>();
        for (String token : expression.trim().split("\\s+")) {
            if (token.length() == 1 && "+-*/".contains(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException(
                            "Невозможно выполнить POP для пустого стека.");
                }
                double right = stack.pop();
                double left = stack.pop();
                stack.push(calculateOperation(left, right, token));
            } else {
                double number;
                try {
                    number = Double.parseDouble(token);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неверный элемент: " + token);
                }
                stack.push(checkFinite(number));
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("В выражении остались лишние числа.");
        }
        return stack.pop();
    }

    private double calculateOperation(double left, double right, String operator) {
        double result;
        switch (operator) {
            case "+": result = left + right; break;
            case "-": result = left - right; break;
            case "*": result = left * right; break;
            default:
                if (right == 0) {
                    throw new IllegalArgumentException("Деление на ноль.");
                }
                result = left / right;
        }
        return checkFinite(result);
    }

    private double checkFinite(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                    "Число или результат выходит за допустимый диапазон.");
        }
        return value;
    }
}
