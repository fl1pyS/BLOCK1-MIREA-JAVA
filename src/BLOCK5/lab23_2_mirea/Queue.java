package BLOCK5.lab23_2_mirea;
public interface Queue {
    // Добавляет элемент в конец очереди. Передавать null нельзя.
    void enqueue(Object value);
    // Возвращает первый элемент без удаления. Очередь должна быть непустой.
    Object element();
    // Удаляет и возвращает первый элемент. Очередь должна быть непустой.
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
