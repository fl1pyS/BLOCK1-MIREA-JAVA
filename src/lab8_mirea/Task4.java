package lab8_mirea;
import java.util.Scanner;
public class Task4 {
    public static long count(int k, int s, boolean first) {
        if (s < 0 || s > k * 9) {
            return 0;
        }

        if (k == 0) {
            if (s == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int start;
        if (first) {
            start = 1;
        } else {
            start = 0;
        }

        long result = 0;
        for (int digit = start; digit <= 9; digit++) {
            result += count(k - 1, s - digit, false);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите k: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: k должно быть целым числом.");
            scanner.close();
            return;
        }
        int k = scanner.nextInt();
        System.out.print("Введите s: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: s должно быть целым числом.");
            scanner.close();
            return;
        }
        int s = scanner.nextInt();
        scanner.close();
        if (k <= 0 || s <= 0) {
            System.out.println("Ошибка: k и s должны быть больше нуля.");
            return;
        }
        System.out.println(count(k, s, true));
    }
}
