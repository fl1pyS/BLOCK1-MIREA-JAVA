package BLOCK4.lab18_8_mirea;
import java.util.Scanner;

public class Task8Tester {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            new ThrowsDemo().getKey(scanner);
        }
    }
}
