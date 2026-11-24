package BLOCK5.lab22_1_mirea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RpnCalculator calculator = new RpnCalculator();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Выражение ОПН или exit: ");
                if (!scanner.hasNextLine()) return;

                String expression = scanner.nextLine().trim();
                if (expression.equalsIgnoreCase("exit")) return;

                try {
                    System.out.println("Результат: " + calculator.calculate(expression));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}