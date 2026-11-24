package BLOCK5.lab23_1_mirea;
public class ArrayQueueADT {
    private final ArrayQueue data = new ArrayQueue();
    public static void enqueue(ArrayQueueADT queue, Object value) { queue.data.enqueue(value); }
    public static Object element(ArrayQueueADT queue) { return queue.data.element(); }
    public static Object dequeue(ArrayQueueADT queue) { return queue.data.dequeue(); }
    public static int size(ArrayQueueADT queue) { return queue.data.size(); }
    public static boolean isEmpty(ArrayQueueADT queue) { return queue.data.isEmpty(); }
    public static void clear(ArrayQueueADT queue) { queue.data.clear(); }
}