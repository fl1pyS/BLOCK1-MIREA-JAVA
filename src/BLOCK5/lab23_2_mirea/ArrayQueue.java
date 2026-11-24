package BLOCK5.lab23_2_mirea;
import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
    private Object[] items = new Object[4];
    private int head;
    protected void addLast(Object value) {
        if (size() == items.length) {
            Object[] larger = new Object[items.length * 2];
            for (int i = 0; i < size(); i++) {
                larger[i] = items[(head + i) % items.length];
            }
            items = larger;
            head = 0;
        }
        items[(head + size()) % items.length] = value;
    }


    protected Object first() { return items[head]; }
    protected void removeFirst() {
        items[head] = null;
        head = (head + 1) % items.length;
    }



    protected void clearStorage() {
        Arrays.fill(items, null);
        head = 0;
    }
}