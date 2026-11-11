package BLOCK2.lab14_mirea;
import java.util.Scanner;

public class Task5 {
    public static boolean isValidDate(String date) {
        String year = "(?:19[0-9]{2}|[2-9][0-9]{3})";
        String months31 = "(?:0[1-9]|[12][0-9]|3[01])/(?:01|03|05|07|08|10|12)/";
        String months30 = "(?:0[1-9]|[12][0-9]|30)/(?:04|06|09|11)/";
        String february = "(?:0[1-9]|1[0-9]|2[0-8])/02/";
        String leapYear = "(?:19|[2-9][0-9])(?:0[48]|[2468][048]|[13579][26])" + "|(?:[2468][048]|[3579][26])00";


        String regex = "(?:" + months31 + "|" + months30 + "|" + february + ")"+ year + "|29/02/(?:" +leapYear +")";
        return date.matches(regex);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String date = scanner.nextLine();
        if (isValidDate(date)) {
            System.out.println("Дата корректна");
        } else {
            System.out.println("Дата некорректна");
        }
        scanner.close();
    }
}