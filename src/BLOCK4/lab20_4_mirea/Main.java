package BLOCK4.lab20_4_mirea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinMax<Integer> minMax = new MinMax<>(new Integer[]{7, 2, 9, 4});
        System.out.println("Минимум: " + minMax.min());
        System.out.println("Максимум: " + minMax.max());
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите целое и дробное число (пример: 10 2.5): ");
                if (!scanner.hasNextLine()) return;
                String[] parts = scanner.nextLine().trim().split("\\s+");

                if (parts.length != 2) {
                    System.out.println("Введите два числа через пробел.");
                    continue;
                }
                try {
                    int first = Integer.parseInt(parts[0]);
                    double second = Double.parseDouble(parts[1]);

                    if (!Double.isFinite(second)) {
                        System.out.println("Второе число должно быть конечным.");
                        continue;
                    }
                    double quotient = Calculator.divide(first, second);
                    System.out.println("Сумма: " + Calculator.sum(first, second));
                    System.out.println("Произведение: " + Calculator.multiply(first, second));
                    System.out.println("Разность: " + Calculator.subtraction(first, second));
                    System.out.println("Частное: " + quotient);
                    return;
                } catch (NumberFormatException e) {
                    System.out.println("Проверьте числа. Дробную часть введите через точку.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}