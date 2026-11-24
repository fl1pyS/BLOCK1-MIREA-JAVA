package BLOCK5.lab23_2_mirea;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class AbstractQueue implements Queue {
    private int size;

    public final void enqueue(Object value) {
        Objects.requireNonNull(value, "Нельзя добавить null.");
        addLast(value);
        size++;
    }
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста.");
        }
        return first();
    }


    public final Object dequeue() {
        Object value = element();
        removeFirst();
        size--;
        return value;
    }
    public final int size() { return size; }
    public final boolean isEmpty() { return size == 0; }


    public final void clear() {
        clearStorage();
        size = 0;
    }
    protected abstract void addLast(Object value);
    protected abstract Object first();
    protected abstract void removeFirst();
    protected abstract void clearStorage();
}
