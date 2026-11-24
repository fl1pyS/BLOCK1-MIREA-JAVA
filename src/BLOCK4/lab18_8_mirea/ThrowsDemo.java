package BLOCK4.lab18_8_mirea;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey(Scanner scanner) {
        while (true) {
            System.out.print("Введите ключ: ");
            if (!scanner.hasNextLine()) return;

            String key = scanner.nextLine().trim();

            try {
                printDetails(key);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Ключ не должен быть пустым.");
        }
        return "Данные для ключа: " + key;
    }
}
