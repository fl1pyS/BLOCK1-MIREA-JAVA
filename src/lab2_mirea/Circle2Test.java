package lab2_mirea;
import java.util.Scanner;

public class Circle2Test {
    public static double readDouble(
            Scanner scanner,
            String message,
            boolean positive
    ) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine();

                if (!Double.isFinite(number)) {
                    System.out.println("Введите конечное число");
                } else if (positive && number <= 0) {
                    System.out.println("Число должно быть больше нуля");
                } else {
                    return number;
                }
            } else {
                System.out.println("Ошибка: введите число");
                scanner.nextLine();
            }
        }
    }

    public static Circle2 readCircle(Scanner scanner) {
        double x = readDouble(
                scanner, "Введите координату x: ", false
        );

        double y = readDouble(
                scanner, "Введите координату y: ", false
        );

        double radius = readDouble(
                scanner, "Введите радиус: ", true
        );

        return new Circle2(x, y, radius);
    }

    public static void printCircle(Circle2 circle) {
        System.out.println(circle);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getLength());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первая окружность:");
        Circle2 first = readCircle(scanner);

        System.out.println("\nВторая окружность:");
        Circle2 second = readCircle(scanner);

        System.out.println("\nДанные первой окружности:");
        printCircle(first);

        System.out.println("\nДанные второй окружности:");
        printCircle(second);

        int result = first.compareRadius(second);

        if (result > 0) {
            System.out.println("\nРадиус первой окружности больше");
        } else if (result < 0) {
            System.out.println("\nРадиус второй окружности больше");
        } else {
            System.out.println("\nРадиусы окружностей равны");
        }

        double newRadius = readDouble(
                scanner,
                "\nВведите новый радиус первой окружности: ",
                true);

        first.setRadius(newRadius);

        System.out.println("Новый радиус: " + first.getRadius());
        printCircle(first);

        scanner.close();
    }
}
