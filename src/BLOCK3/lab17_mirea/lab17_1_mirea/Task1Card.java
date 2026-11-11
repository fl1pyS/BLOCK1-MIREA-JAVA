package BLOCK3.lab17_mirea.lab17_1_mirea;
import java.util.Scanner;

public class Task1Card {
    private String name;
    private String group;
    Task1Card next;
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