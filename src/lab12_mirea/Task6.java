package lab12_mirea;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task6 {
    public static StringBuilder getLine(String[] words) {
        StringBuilder line = new StringBuilder();
        boolean[] used = new boolean[words.length];

        if (build(words, used, line, 0)) {
            return line;
        }
        return null;
    }

    private static boolean build(
            String[] words,
            boolean[] used,
            StringBuilder line,
            int count
    ) {
        if (count == words.length) {
            return true;
        }
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }
            if (line.length() > 0) {
                char last = Character.toLowerCase(line.charAt(line.length() - 1));
                char first = Character.toLowerCase(words[i].charAt(0));
                if (last != first) {
                    continue;
                }
            }
            int oldLength = line.length();
            if (oldLength > 0) {
                line.append(' ');
            }
            line.append(words[i]);
            used[i] = true;
            if (build(words, used, line, count + 1)) {
                return true;
            }
            used[i] = false;
            line.setLength(oldLength);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String fileName = scanner.nextLine();
        try {
            String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8).trim();
            if (text.isEmpty()) {
                System.out.println("Файл пуст");
            } else {
                String[] words = text.split("\\s+");
                StringBuilder result = getLine(words);
                if (result == null) {
                    System.out.println("Нельзя составить цепочку из всех слов");
                } else {
                    System.out.println(result);
                }
            }
        } catch (IOException exception) {
            System.out.println("Не удалось прочитать файл: " + exception.getMessage());
        }
        scanner.close();
    }
}