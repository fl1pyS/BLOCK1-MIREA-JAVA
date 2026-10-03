package lab2_mirea;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        while (true) {
            System.out.print("Введите размер массива: ");

            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                scanner.nextLine();

                if (size > 0) {
                    break;
                }

                System.out.println("Размер должен быть больше нуля");
            } else {
                System.out.println("Введите целое число");
                scanner.nextLine();
            }
        }

        String[] words = new String[size];

        for (int i = 0; i < words.length; i++) {
            while (true) {
                System.out.print("Введите строку № " + (i + 1) + ": ");
                String text = scanner.nextLine().trim();

                if (!text.isEmpty()) {
                    words[i] = text;
                    break;
                }

                System.out.println("Строка не должна быть пустой");
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(words));

        for (int i = 0; i < words.length / 2; i++) {
            int opposite = words.length - 1 - i;

            String temp = words[i];
            words[i] = words[opposite];
            words[opposite] = temp;
        }

        System.out.println("Обратный массив: " + Arrays.toString(words));

        scanner.close();
    }
}
