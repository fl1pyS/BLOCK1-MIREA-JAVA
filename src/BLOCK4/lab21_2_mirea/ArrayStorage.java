package BLOCK4.lab21_2_mirea;
public class ArrayStorage<T> {
    private final T array;

    public ArrayStorage(T array) {
        if (array == null || !array.getClass().isArray()) {
            throw new IllegalArgumentException("Нужен массив.");
        }
        this.array = array;
    }


    public T getArray() {
        return array;
    }
}
