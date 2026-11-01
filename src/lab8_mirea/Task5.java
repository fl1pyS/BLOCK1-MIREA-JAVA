package lab8_mirea;
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
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(sumDigits(n));
    }
}
