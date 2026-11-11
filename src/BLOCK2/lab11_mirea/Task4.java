package BLOCK2.lab11_mirea;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static int readInt(Scanner scanner, String message, int min, int max) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number >= min && number <= max) {
                    return number;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Введите целое число от " + min + " до " + max);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int year = readInt(scanner, "Год (1–9999): ", 1, 9999);
            int month = readInt(scanner, "Месяц: ", 1, 12);
            int day = readInt(scanner, "Число: ", 1, 31);
            int hour = readInt(scanner, "Часы: ", 0, 23);
            int minute = readInt(scanner, "Минуты: ", 0, 59);
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.setLenient(false);
            calendar.set(year, month - 1, day, hour, minute, 0);
            try {
                Date date = calendar.getTime();
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                System.out.println("Date: " + format.format(date));
                System.out.println("Calendar: " + format.format(calendar.getTime()));
                break;
            } catch (IllegalArgumentException exception) {
                System.out.println("Такой даты не существует. Повторите ввод.");
            }
        }
        scanner.close();
    }
}
