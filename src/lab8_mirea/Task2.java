package lab8_mirea;
import java.util.Scanner;
public class Task2 {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printNumbers(n - 1);
        System.out.print(" " + n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        scanner.close();
        printNumbers(n);
    }
}
