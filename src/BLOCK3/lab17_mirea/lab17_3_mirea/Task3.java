package BLOCK3.lab17_mirea.lab17_3_mirea;

public class Task3 {
    private Task3Card head;
    private Task3Card tail;
    private int size;
    void add(Task3Card card) {
        if (isEmpty()) {
            head = card;
        } else {
            tail.next = card;
        }
        tail = card;
        tail.next = head;
        size++;
    }
    private Task3Card find(int number) {
        if (number < 1 || number > size) {
            return null;
        }
        Task3Card current = head;
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
            Task3Card previous = find(number - 1);
            previous.next = previous.next.next;
            if (number == size) {
                tail = previous;
            }
        }
        size--;
        tail.next = head;
        return true;
    }
    void print(int number) {
        Task3Card card = find(number);
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