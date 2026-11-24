package BLOCK4.lab21_2_mirea;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayStorage<int[]> numbers = new ArrayStorage<>(new int[]{10, 20, 30});
        ArrayStorage<long[]> longs = new ArrayStorage<>(new long[]{100L, 200L});


        System.out.println(Arrays.toString(numbers.getArray()));
        System.out.println(Arrays.toString(longs.getArray()));
    }
}