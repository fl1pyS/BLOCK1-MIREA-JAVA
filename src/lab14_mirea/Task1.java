package lab14_mirea;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        while (true) {
            System.out.print("Введите регулярное выражение-разделитель: ");
            String regex = scanner.nextLine();
            try {
                Pattern pattern = Pattern.compile(regex);
                String[] parts = pattern.split(text, -1);
                for (int i = 0; i < parts.length; i++) {
                    System.out.println((i + 1) + ": " + parts[i]);
                }
                break;
            } catch (PatternSyntaxException exception) {
                System.out.println("Ошибка в регулярном выражении. Повторите ввод.");
            }
        }
        scanner.close();
    }
}
