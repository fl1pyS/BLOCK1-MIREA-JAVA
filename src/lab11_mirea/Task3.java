package lab11_mirea;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        Calendar birthday = new GregorianCalendar(2005, Calendar.MARCH, 15);
        Student student = new Student(
                101,
                "Иван",
                "Петров",
                "Информатика",
                2,
                "ИКБО-01",
                4.5,
                birthday.getTime()
        );
        System.out.println("Короткий формат:");
        System.out.println(student.toString(DateFormat.SHORT));
        System.out.println("\nСредний формат:");
        System.out.println(student.toString(DateFormat.MEDIUM));
        System.out.println("\nПолный формат:");
        System.out.println(student.toString(DateFormat.FULL));
    }
}
