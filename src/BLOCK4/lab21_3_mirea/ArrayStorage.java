package BLOCK4.lab21_3_mirea;
import java.lang.reflect.Array;
public class ArrayStorage<T> {
    private final T array;

    public ArrayStorage(T array) {
        if (array == null || !array.getClass().isArray()) {
            throw new IllegalArgumentException("Нужен массив.");
        }
        this.array = array;
    }

    public Object get(int index) {
        return Array.get(array, index);
    }
}