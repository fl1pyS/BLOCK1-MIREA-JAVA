package lab1_mrea;
import java.util.Scanner;
public class SummerMassive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Введите размер массива: ");
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if(n>0){
                    break;
                }
            }
            else{
                System.out.println("Число должно быть больше нуля");
                sc.next();
            }
        }

        int[] mass = new int[n];
        int summa = 0;
        double sra;
        for (int i = 0; i<mass.length;i++) {
            System.out.println("Введите элемент " + (i+1) + ": ");
            if (sc.hasNextInt()) {
                mass[i] = sc.nextInt();
                summa += mass[i];
            } else {
                System.out.println("Число не целочисленное");
                sc.next();
            }

        }
        sra = (double) summa / mass.length;
        System.out.println("Сумма массива: " + summa);
        System.out.println("Среднее арифметическое массива: " + sra);
        sc.close();
    }
}
