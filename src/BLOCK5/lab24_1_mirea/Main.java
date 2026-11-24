package BLOCK5.lab24_1_mirea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        System.out.println("Число по умолчанию: " + factory.createComplex());
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите две целые части через пробел: ");
                if (!scanner.hasNextLine()) return;
                String[] parts = scanner.nextLine().trim().split("\\s+");
                if (parts.length != 2) {
                    System.out.println("Нужно ввести два числа.");
                    continue;
                }


                try {
                    int real = Integer.parseInt(parts[0]);
                    int imaginary = Integer.parseInt(parts[1]);
                    System.out.println(factory.createComplex(real, imaginary));
                    return;
                } catch (NumberFormatException e) {
                    System.out.println("Обе части должны быть целыми числами типа int.");
                }
            }
        }
    }
}