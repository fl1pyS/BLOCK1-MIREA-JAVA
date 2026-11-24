package BLOCK4.lab21_3_mirea;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayStorage<int[]> numbers = new ArrayStorage<>(new int[]{10, 20, 30});

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Индекс в [10, 20, 30] (0–2): ");
                if (!scanner.hasNextLine()) return;

                try {
                    int index = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Элемент: " + numbers.get(index));
                    return;
                } catch (NumberFormatException e) {
                    System.out.println("Индекс должен быть целым числом.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Нет элемента с таким индексом.");
                }
            }
        }
    }
}
