package BLOCK4.lab20_2_mirea;
public class GenericBox<T, V, K> {
    private final T first;
    private final V second;
    private final K third;

    public GenericBox(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public V getSecond() { return second; }
    public K getThird() { return third; }

    public void printClassNames() {
        System.out.println(first.getClass().getSimpleName());
        System.out.println(second.getClass().getSimpleName());
        System.out.println(third.getClass().getSimpleName());
    }
}