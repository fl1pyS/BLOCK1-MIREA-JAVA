package lab2_mirea;

import java.util.Scanner;


public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readPositiveInt(scanner, "Введите максимальное количество компьютеров: ");

        Shop shop = new Shop(size);

        int command = -1;

        while (command != 0) {
            printMenu();

            command = readInt(scanner, "Выберите действие: ");

            switch (command) {
                case 1:
                    addComputer(scanner, shop);
                    break;
                case 2:
                    removeComputer(scanner, shop);
                    break;
                case 3:
                    findComputer(scanner, shop);
                    break;
                case 4:
                    shop.printComputers();
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\nМеню");
        System.out.println("1 — добавить компьютер");
        System.out.println("2 — удалить компьютер");
        System.out.println("3 — найти компьютер");
        System.out.println("4 — показать все компьютеры");
        System.out.println("0 — выйти");
    }

    public static void addComputer(Scanner scanner, Shop shop) {
        String brand = readString(scanner, "Введите производителя: ");

        String model = readString(scanner, "Введите модель: ");

        double price = readPositiveDouble(scanner, "Введите стоимость: ");

        Computer computer = new Computer(brand, model, price);

        shop.addComputer(computer);
    }

    public static void removeComputer(Scanner scanner, Shop shop) {
        String model = readString(scanner, "Введите модель для удаления: ");

        shop.removeComputer(model);
    }

    public static void findComputer(Scanner scanner, Shop shop) {
        String model = readString(scanner, "Введите модель для поиска: ");

        Computer computer = shop.findComputer(model);

        if (computer != null) {
            System.out.println("Компьютер найден:");
            System.out.println(computer);
        } else {
            System.out.println("Компьютер не найден");
        }
    }

    public static int readInt(
            Scanner scanner,
            String message
    ) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                return number;
            }

            System.out.println("Ошибка: необходимо ввести целое число");
            scanner.nextLine();
        }
    }

    public static int readPositiveInt(
            Scanner scanner,
            String message
    ) {
        while (true) {
            int number = readInt(scanner, message);

            if (number > 0) {
                return number;
            }

            System.out.println("Число должно быть больше нуля");
        }
    }

    public static double readPositiveDouble(
            Scanner scanner,
            String message
    ) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine();

                if (number > 0) {
                    return number;
                }
                System.out.println("Стоимость должна быть больше нуля");
            } else {
                System.out.println("Ошибка: необходимо ввести число");
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
}
