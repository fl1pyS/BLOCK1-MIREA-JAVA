package BLOCK5.lab23_1_mirea;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 4; i++) queue.enqueue(i);
        check(queue.dequeue().equals(0));
        queue.enqueue(4);
        queue.enqueue(5);
        check(queue.size() == 5 && queue.element().equals(1));
        for (int i = 1; i <= 5; i++) check(queue.dequeue().equals(i));
        check(queue.isEmpty());
        queue.enqueue("A");
        queue.clear();
        expectError(NoSuchElementException.class, queue::dequeue);
        expectError(NullPointerException.class, () -> queue.enqueue(null));
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        check(ArrayQueueModule.size() == 2 && ArrayQueueModule.element().equals("A"));
        check(ArrayQueueModule.dequeue().equals("A"));
        ArrayQueueModule.clear();
        check(ArrayQueueModule.isEmpty());
        expectError(NoSuchElementException.class, ArrayQueueModule::element);

        ArrayQueueADT first = new ArrayQueueADT();
        ArrayQueueADT second = new ArrayQueueADT();
        ArrayQueueADT.enqueue(first, "A");
        ArrayQueueADT.enqueue(first, "B");
        check(ArrayQueueADT.isEmpty(second));
        check(ArrayQueueADT.size(first) == 2 && ArrayQueueADT.element(first).equals("A"));
        check(ArrayQueueADT.dequeue(first).equals("A"));
        ArrayQueueADT.clear(first);
        check(ArrayQueueADT.isEmpty(first));
        expectError(NoSuchElementException.class, () -> ArrayQueueADT.dequeue(first));
        System.out.println("Успешно!");
    }
    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Ошибка в очереди.");
    }
    private static void expectError(Class<? extends RuntimeException> type, Runnable action) {
        try {
            action.run();
        } catch (RuntimeException e) {
            if (type.isInstance(e)) return;
            throw e;
        }
        throw new AssertionError("Ожидалось исключение: " + type.getSimpleName());
    }
}
