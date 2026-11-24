package BLOCK4.lab19_1_mirea;
import java.util.Scanner;
public class Task1Tester {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ФИО: ");
            if (!scanner.hasNextLine()) return;
            String fullName = scanner.nextLine().trim();

            System.out.print("ИНН: ");
            if (!scanner.hasNextLine()) return;
            String inn = scanner.nextLine().trim();

            try {
                Task1.checkInn(fullName, inn);
                System.out.println("Заказ оформлен.");
            } catch (InvalidInnException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
