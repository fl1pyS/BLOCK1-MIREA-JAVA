package BLOCK3.lab17_mirea.lab17_3_mirea;
import java.util.Scanner;



public class Task3Card {
    private String name;
    private String group;
    Task3Card next;
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
