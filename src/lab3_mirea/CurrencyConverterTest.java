package lab3_mirea;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterTest {
    public static double readAmount(Scanner scanner) {
        while (true) {
            System.out.print("Введите сумму: ");

            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                scanner.nextLine();

                if (Double.isFinite(amount) && amount >= 0) {
                    return amount;
                }

                System.out.println(
                        "Сумма должна быть конечной и неотрицательной"
                );
            } else {
                System.out.println("Ошибка: введите число");
                scanner.nextLine();
            }
        }
    }

    public static int readCurrency(Scanner scanner) {
        while (true) {
            System.out.println("1 — RUB");
            System.out.println("2 — USD");
            System.out.println("3 — EUR");
            System.out.println("0 — выход");
            System.out.print("Выберите действие: ");

            if (scanner.hasNextInt()) {
                int command = scanner.nextInt();
                scanner.nextLine();

                if (command >= 0 && command <= 3) {
                    return command;
                }

                System.out.println("Введите число от 0 до 3");
            } else {
                System.out.println("Ошибка: введите целое число");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        CurrencyConverter converter = new CurrencyConverter();
        String[] currencies = {"RUB", "USD", "EUR"};

        NumberFormat format =
                NumberFormat.getCurrencyInstance(
                        new Locale("ru", "RU")
                );

        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);

        System.out.print("Дробные числа вводите через точку.");

        while (true) {
            System.out.println("\nИсходная валюта:");
            int fromCommand = readCurrency(scanner);

            if (fromCommand == 0) {
                break;
            }

            System.out.println("\nВалюта результата:");
            int toCommand = readCurrency(scanner);

            if (toCommand == 0) {
                break;
            }

            String from = currencies[fromCommand - 1];
            String to = currencies[toCommand - 1];

            double amount = readAmount(scanner);

            try {
                double result = converter.convert(amount, from, to);

                format.setCurrency(Currency.getInstance(to));

                System.out.println(
                        "Результат: " + format.format(result)
                );
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("Программа завершена");
        scanner.close();
    }
}