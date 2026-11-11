package BLOCK2.lab8_mirea;
import java.util.Scanner;
public class Task5 {
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Ошибка: число должно быть больше нуля.");
            return;
        }
        System.out.println(sumDigits(n));
    }
}
