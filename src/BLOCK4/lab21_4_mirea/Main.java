package BLOCK4.lab21_4_mirea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Путь к каталогу: ");
                if (!scanner.hasNextLine()) return;

                try {
                    Task4.listDirectory(scanner.nextLine());
                    return;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}