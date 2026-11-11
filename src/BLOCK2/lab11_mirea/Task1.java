package BLOCK2.lab11_mirea;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {
        String surname = "Иванов";
        Calendar received = new GregorianCalendar(2026, Calendar.NOVEMBER, 1, 10, 0);
        Date submitted = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Разработчик: " + surname);
        System.out.println("Получение задания: " + format.format(received.getTime()));
        System.out.println("Сдача задания: " + format.format(submitted));
    }
}
