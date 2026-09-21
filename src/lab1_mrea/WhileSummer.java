package lab1_mrea;
import java.util.Scanner;
public class WhileSummer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Введите размер массива: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }
            } else {
                System.out.println("Число должно быть больше нуля");
                sc.next();
            }
        }
        int[] mass = new int[n];
        int i = 0;
        while (i < mass.length) {
            System.out.println("Введите элемент " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                mass[i] = sc.nextInt();
                i++;
            } else {
                System.out.println("Число не является целочисленным");
                sc.next();

            }
        }
        int summ = 0;
        int j = 0;
        do{
            summ += mass[j];
            j++;
        }while(j < mass.length);

        int max = mass[0];
        int min = mass[0];
        int k = 0;
        while(k<mass.length){
            if(mass[k] > max) max = mass[k];
            if(mass[k] < min) min = mass[k];
            k++;
        }
        System.out.println("Сумма: " + summ);
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
