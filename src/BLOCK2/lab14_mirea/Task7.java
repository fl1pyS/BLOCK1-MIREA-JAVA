package BLOCK2.lab14_mirea;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static boolean checkPassword(String password) {
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9_]{8,}";
        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        if (checkPassword(password)) {
            System.out.println("Пароль соответствует требованиям");
        } else {
            System.out.println("Пароль не соответствует требованиям");
        }
        scanner.close();
    }
}
