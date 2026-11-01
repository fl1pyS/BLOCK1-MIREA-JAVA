package lab8_mirea;
import java.util.Scanner;

public class Task3 {
    public static void printNumbers(int a, int b) {
        System.out.println(a);
        if (a == b) {
            return;
        }
        if (a < b) {
            printNumbers(a + 1, b);
        } else {
            printNumbers(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printNumbers(a, b);

        scanner.close();
    }
}
