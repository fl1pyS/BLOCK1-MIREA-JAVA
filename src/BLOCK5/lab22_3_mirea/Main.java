package BLOCK5.lab22_3_mirea;
public class Main {
    public static void main(String[] args) {
        RpnCalculator calculator = new RpnCalculator();

        check(calculator, "2 3 * 4 5 * +", 26);
        check(calculator, "10 3 -", 7);
        check(calculator, "10 4 /", 2.5);
        check(calculator, "-2 3 +", 1);

        checkError(calculator, "1 2 + *", "POP");
        checkError(calculator, "5 0 /", "Деление на ноль");
        checkError(calculator, "1 2", "лишние числа");
        checkError(calculator, "q 2 +", "Неверный элемент");
        checkError(calculator, "NaN", "допустимый диапазон");
        checkError(calculator, " ", "Введите выражение");
        checkError(calculator, null, "Введите выражение");

        System.out.println("Все тесты пройдены.");
    }

    private static void check(RpnCalculator calculator, String text, double expected) {
        if (calculator.calculate(text) != expected) {
            throw new AssertionError("Неверный результат: " + text);
        }
    }

    private static void checkError(RpnCalculator calculator, String text, String message) {
        try {
            calculator.calculate(text);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains(message)) return;
            throw new AssertionError(e);
        }
        throw new AssertionError("Ожидалась ошибка: " + text);
    }
}