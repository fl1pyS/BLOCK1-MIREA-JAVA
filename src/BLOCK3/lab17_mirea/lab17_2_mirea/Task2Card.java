package BLOCK3.lab17_mirea.lab17_2_mirea;
import java.util.Scanner;

public class Task2Card {
    private String name;
    private String group;
    Task2Card next;
    Task2Card prev;
    boolean read(Scanner scanner) {
        System.out.print("Имя: ");
        if (!scanner.hasNextLine()) return false;
        name = scanner.nextLine().trim();
        System.out.print("Группа: ");
        if (!scanner.hasNextLine()) return false;
        group = scanner.nextLine().trim();
        return !name.isEmpty() && !group.isEmpty();
    }
    void print() {
        System.out.println("Имя: " + name + ", группа: " + group);
    }
}