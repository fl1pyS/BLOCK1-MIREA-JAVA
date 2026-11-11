package BLOCK2.lab13_mirea;
import java.util.Locale;

public class Task1 {
    public static void process(String text) {
        if (text == null) {
            System.out.println("Строка не задана");
            return;
        }
        if (text.isEmpty()) {
            System.out.println("Строка пустая, последнего символа нет");
        } else {
            System.out.println("Последний символ: " + text.charAt(text.length() - 1));
        }
        System.out.println("Заканчивается на !!!: " + text.endsWith("!!!"));
        System.out.println("Начинается с I like: " + text.startsWith("I like"));
        System.out.println("Содержит Java: " + text.contains("Java"));

        int index = text.indexOf("Java");

        System.out.println("Позиция Java: " + index);
        System.out.println("Замена a на o: " + text.replace('a', 'o'));
        System.out.println("Верхний регистр: " + text.toUpperCase(Locale.ROOT));
        System.out.println("Нижний регистр: " + text.toLowerCase(Locale.ROOT));

        if (index >= 0) {
            System.out.println("Подстрока: " + text.substring(index, index + 4));
        } else {
            System.out.println("Подстрока Java не найдена");
        }
    }
    public static void main(String[] args) {
        process("I like Java!!!");
    }
}