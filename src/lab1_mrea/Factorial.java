package lab1_mrea;
import java.util.Scanner;
public class Factorial {
    public static long factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Факториал существует для положительных чисел");
        }
        long result = 1;
        for(int i = 2; i <= n; i ++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Введите факториал(Для выхода введите 0): ");
            if(sc.hasNextInt()){
                int n = sc.nextInt();
                if(n==0){
                    break;
                }
                System.out.println(n + "!" + " = " + factorial(n));
            }
            else{
                System.out.println("Число должно быть целочисленным");
                sc.next();
            }
        }
    sc.close();
    }
}
