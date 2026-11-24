package BLOCK5.lab23_1_mirea;
public class ArrayQueueModule {
    private static final ArrayQueue queue = new ArrayQueue();
    public static void enqueue(Object value) { queue.enqueue(value); }
    public static Object element() { return queue.element(); }
    public static Object dequeue() { return queue.dequeue(); }
    public static int size() { return queue.size(); }
    public static boolean isEmpty() { return queue.isEmpty(); }
    public static void clear() { queue.clear(); }
}