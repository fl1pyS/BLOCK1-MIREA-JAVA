package BLOCK2.lab11_mirea;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        format.setLenient(false);
        while (true) {
            System.out.print("Введите дату и время (дд.ММ.гггг ЧЧ:мм:сс): ");
            String text = scanner.nextLine();
            if (!text.matches("\\d{2}\\.\\d{2}\\.\\d{4} \\d{2}:\\d{2}:\\d{2}")) {
                System.out.println("Неверный формат");
                continue;
            }
            try {
                Date entered = format.parse(text);
                Date current = new Date();

                System.out.println("Текущая дата: " + format.format(current));
                if (entered.before(current)) {System.out.println("Введённая дата раньше текущей");
                } else if (entered.after(current)) {System.out.println("Введённая дата позже текущей");
                } else {
                    System.out.println("Даты совпадают");
                }

                break;
            } catch (ParseException exception) {
                System.out.println("Такой даты или времени не существует");
            }
        }
        scanner.close();
    }
}