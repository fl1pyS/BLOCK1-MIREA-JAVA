package BLOCK5.lab23_2_mirea;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        test(new ArrayQueue());
        test(new LinkedQueue());
        System.out.println("Обе очереди прошли тесты.");
    }



    private static void test(Queue queue) {
        for (int i = 0; i < 8; i++) queue.enqueue(i);
        check(queue.size() == 8 && queue.element().equals(0));
        for (int i = 0; i < 8; i++) check(queue.dequeue().equals(i));
        check(queue.isEmpty());
        queue.enqueue("A");
        check(queue.dequeue().equals("A"));
        queue.enqueue("B");
        queue.clear();
        check(queue.size() == 0 && queue.isEmpty());
        try {
            queue.dequeue();
            throw new AssertionError("Пустая очередь не должна отдавать элемент.");
        } catch (NoSuchElementException e) {
            System.out.println(queue.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    private static void check(boolean condition) {
        if (!condition) throw new AssertionError("Ошибка в очереди.");
    }
}