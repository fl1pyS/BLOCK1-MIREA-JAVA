package BLOCK3.lab17_mirea.lab17_2_mirea;

import java.util.Scanner;


public class Task2Tester {
    private static int readNumber(Scanner scanner) {
        if (!scanner.hasNextLine()) {
            return -1;
        }
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException exception) {
            return -1;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Task2 list = new Task2();
            System.out.println("Двусвязный список");

            while (true) {
                System.out.println("\n1 — создать пустой список\n2 — добавить студента");
                System.out.println("3 — удалить элемент\n4 — вывести элемент");
                System.out.println("5 — очистить список\n6 — проверить, пуст ли список");
                System.out.print("0 — выход\nКоманда: ");

                if (!scanner.hasNextLine()) {
                    break;
                }

                switch (readNumber(scanner)) {
                    case 0:
                        return;
                    case 1:
                        list = new Task2();
                        System.out.println("Создан пустой список.");
                        break;
                    case 2:
                        Task2Card card = new Task2Card();
                        if (card.read(scanner)) {
                            list.add(card);
                            System.out.println("Студент добавлен.");
                        } else {
                            System.out.println("Имя и группа должны быть заполнены.");
                        }
                        break;
                    case 3:
                        System.out.print("Номер элемента: ");
                        if (list.remove(readNumber(scanner))) {
                            System.out.println("Элемент удалён.");
                        } else {
                            System.out.println("Элемента с таким номером нет.");
                        }
                        break;
                    case 4:
                        System.out.print("Номер элемента: ");
                        list.print(readNumber(scanner));
                        break;
                    case 5:
                        list.clear();
                        System.out.println("Список очищен.");
                        break;
                    case 6:
                        if (list.isEmpty()) {
                            System.out.println("Список пуст.");
                        } else {
                            System.out.println("Список не пуст.");
                        }
                        break;
                    default:
                        System.out.println("Нет такой команды.");
                }
            }
        }
    }
}
