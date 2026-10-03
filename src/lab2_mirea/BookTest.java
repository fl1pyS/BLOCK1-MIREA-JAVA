package lab2_mirea;
import java.util.Scanner;

public class BookTest {
    public static int readPositiveInt(
            Scanner scanner,
            String message
    ) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number > 0) {
                    return number;
                }

                System.out.println("Число должно быть больше нуля");
            } else {
                System.out.println("Ошибка: введите целое число");
                scanner.nextLine();
            }
        }
    }

    public static String readString(
            Scanner scanner,
            String message
    ) {
        while (true) {
            System.out.print(message);
            String text = scanner.nextLine().trim();

            if (!text.isEmpty()) {
                return text;
            }

            System.out.println("Строка не должна быть пустой");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPositiveInt(
                scanner,
                "Введите количество книг: "
        );

        Bookshelf shelf = new Bookshelf(size);

        for (int i = 0; i < size; i++) {
            System.out.println("\nКнига № " + (i + 1));

            String author = readString(
                    scanner,
                    "Введите автора: "
            );

            String title = readString(
                    scanner,
                    "Введите название: "
            );

            int year = readPositiveInt(
                    scanner,
                    "Введите год издания: "
            );

            Book book = new Book(author, title, year);
            shelf.addBook(book);
        }

        System.out.println("\nКниги на полке:");
        shelf.printBooks();

        System.out.println(
                "\nСамая ранняя книга: " + shelf.getEarliestBook()
        );

        System.out.println(
                "Самая поздняя книга: " + shelf.getLatestBook()
        );

        shelf.sortByYear();

        System.out.println("\nКниги по возрастанию года издания:");
        shelf.printBooks();

        scanner.close();
    }
}
