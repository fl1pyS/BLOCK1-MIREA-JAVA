package BLOCK4.lab20_4_mirea;
public class Calculator {
    public static <T extends Number, V extends Number> double sum(T first, V second) {
        return first.doubleValue() + second.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiply(T first, V second) {
        return first.doubleValue() * second.doubleValue();
    }
    public static <T extends Number, V extends Number> double divide(T first, V second) {
        double divisor = second.doubleValue();
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль.");
        }
        return first.doubleValue() / divisor;
    }


    public static <T extends Number, V extends Number> double subtraction(T first, V second) {
        return first.doubleValue() - second.doubleValue();
    }
}