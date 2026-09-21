package lab1_mrea;
public class GarmRow {
    public static void main(String[] args){
        double summ = 0.0;
        for(int i = 1; i < 11; i++){
            summ += 1.0 /i;
            System.out.printf("%3d %10.6f %10.6f%n", i, 1.0 / i, summ);
        }
    }
}
