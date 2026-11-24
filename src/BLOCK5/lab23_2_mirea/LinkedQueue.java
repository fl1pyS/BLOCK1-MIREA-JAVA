package BLOCK5.lab23_2_mirea;
public class LinkedQueue extends AbstractQueue {
    private static class Node {
        private final Object value;
        private Node next;



        Node(Object value) { this.value = value; }
    }
    private Node head;
    private Node tail;
    protected void addLast(Object value) {
        Node node = new Node(value);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    protected Object first() { return head.value; }
    protected void removeFirst() {
        head = head.next;
        if (head == null) tail = null;
    }



    protected void clearStorage() {
        head = null;
        tail = null;
    }
}