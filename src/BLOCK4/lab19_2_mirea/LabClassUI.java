package BLOCK4.lab19_2_mirea;
import java.util.Scanner;
public class LabClassUI {
    public void run(LabClass group) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1 — сортировка, 2 — поиск, 0 — выход");
                if (!scanner.hasNextLine()) return;
                String command = scanner.nextLine().trim();
                if (command.equals("0")) {
                    return;
                } else if (command.equals("1")) {
                    group.sortByGpa();
                    group.print();
                } else if (command.equals("2")) {
                    System.out.print("ФИО: ");
                    if (!scanner.hasNextLine()) return;
                    try {
                        System.out.println(group.find(scanner.nextLine()));
                    } catch (EmptyStringException | StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Нет такой команды.");
                }
            }
        }
    }
}
