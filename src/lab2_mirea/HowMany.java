package lab2_mirea;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine().trim();

        int count = 0;

        if (!text.isEmpty()) {
            String[] words = text.split("\\s+");
            count = words.length;
        }

        System.out.println("Количество слов: " + count);

        scanner.close();
    }
}
