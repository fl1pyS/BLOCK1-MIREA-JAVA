package BLOCK2.lab13_mirea.lab13_3_mirea;

import java.util.Scanner;

public class PhoneNumberTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Введите номер телефона: ");
            try {
                PhoneNumber phone = new PhoneNumber(scanner.nextLine());
                System.out.println(phone.getFormattedNumber());
                break;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
        scanner.close();
    }
}

