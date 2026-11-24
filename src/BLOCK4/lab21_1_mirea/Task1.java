package BLOCK4.lab21_1_mirea;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}