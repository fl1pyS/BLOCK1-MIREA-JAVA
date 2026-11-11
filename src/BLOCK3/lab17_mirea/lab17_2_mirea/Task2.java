package BLOCK3.lab17_mirea.lab17_2_mirea;

public class Task2 {
    private Task2Card head;
    private Task2Card tail;
    private int size;
    void add(Task2Card card) {
        card.prev = tail;
        if (isEmpty()) {
            head = card;
        } else {
            tail.next = card;
        }
        tail = card;
        size++;
    }
    private Task2Card find(int number) {
        if (number < 1 || number > size) {
            return null;
        }
        Task2Card current = head;
        for (int i = 1; i < number; i++) {
            current = current.next;
        }
        return current;
    }
    boolean remove(int number) {
        Task2Card card = find(number);
        if (card == null) {
            return false;
        }
        if (card.prev == null) {
            head = card.next;
        } else {
            card.prev.next = card.next;
        }
        if (card.next == null) {
            tail = card.prev;
        } else {
            card.next.prev = card.prev;
        }
        size--;
        return true;
    }
    void print(int number) {
        Task2Card card = find(number);
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