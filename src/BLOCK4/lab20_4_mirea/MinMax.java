package BLOCK4.lab20_4_mirea;
public class MinMax<T extends Comparable<T>> {
    private final T[] array;
    public MinMax(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст.");
        }
        this.array = array;
    }
    public T min() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) < 0) {
                result = array[i];
            }
        }
        return result;
    }
    public T max() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }
}
