package BLOCK5.lab23_1_mirea;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayQueue {
    // head — индекс начала очереди.
    // size — число элементов от 0 до длины массива.
    // После конца массива продолжаем с начала.
    private Object[] items = new Object[4];
    private int head;
    private int size;

    // Добавляет элемент в конец. Размер увеличивается на один. Передавать null нельзя.
    public void enqueue(Object value) {
        Objects.requireNonNull(value, "Нельзя добавить null.");
        if (size == items.length) {
            Object[] larger = new Object[items.length * 2];
            for (int i = 0; i < size; i++) {
                larger[i] = items[(head + i) % items.length];
            }
            items = larger;
            head = 0;
        }

        items[(head + size) % items.length] = value;
        size++;
    }

    // Возвращает первый элемент без удаления. Очередь должна быть непустой.
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста.");
        }
        return items[head];
    }




    // Удаляет и возвращает первый элемент. Очередь должна быть непустой.
    // Размер уменьшается на один.
    public Object dequeue() {
        Object first = element();
        items[head] = null;
        head = (head + 1) % items.length;
        size--;
        return first;
    }
    // Возвращает количество элементов.
    public int size() {
        return size;
    }
    // Возвращает true, если очередь пуста.
    public boolean isEmpty() {
        return size == 0;
    }
    // Очищает очередь. Размер становится равен нулю.
    public void clear() {
        Arrays.fill(items, null);
        head = 0;
        size = 0;
    }
}