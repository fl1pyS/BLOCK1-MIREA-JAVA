package BLOCK3.lab17_mirea.lab17_1_mirea;

public class Task1 {
    private Task1Card head;
    private Task1Card tail;
    private int size;
    void add(Task1Card card) {
        if (isEmpty()) {
            head = card;
        } else {
            tail.next = card;
        }
        tail = card;
        size++;
    }
    private Task1Card find(int number) {
        if (number < 1 || number > size) {
            return null;
        }
        Task1Card current = head;
        for (int i = 1; i < number; i++) {
            current = current.next;
        }
        return current;
    }
    boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        if (size == 1) {
            clear();
            return true;
        }
        if (number == 1) {
            head = head.next;
        } else {
            Task1Card previous = find(number - 1);
            previous.next = previous.next.next;
            if (number == size) {
                tail = previous;
            }
        }
        size--;
        return true;
    }
    void print(int number) {
        Task1Card card = find(number);
        if (card == null) {
            System.out.println("Элемента с таким номером нет.");
        } else {
            card.print();
        }
    }
    void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    boolean isEmpty() {
        return head == null;
    }
}