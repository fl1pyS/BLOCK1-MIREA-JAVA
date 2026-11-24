package BLOCK4.lab18_4_mirea;
import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo(Scanner scanner) {
        while (true) {
            System.out.print("Введите целое число: ");
            if (!scanner.hasNextLine()) return;

            String text = scanner.nextLine().trim();

            try {
                int number = Integer.parseInt(text);
                System.out.println("Результат: " + (2 / number));
                return;
            } catch (NumberFormatException e) {
                System.out.println("Нужно ввести целое число.");
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя.");
            } finally {
                System.out.println("Попытка завершена.");
            }
        }
    }
}