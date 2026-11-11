package BLOCK2.lab8_mirea;
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
        System.out.print("Введите A: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: A должно быть целым числом.");
            scanner.close();
            return;
        }
        int a = scanner.nextInt();
        System.out.print("Введите B: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: B должно быть целым числом.");
            scanner.close();
            return;
        }
        int b = scanner.nextInt();
        scanner.close();
        printNumbers(a, b);
    }
}
