package BLOCK4.lab20_3_mirea;

public class Main {
    public static void main(String[] args) {
        GenericBox<String, Dog, Integer> box = new GenericBox<>("Java", new Dog(), 10);
        box.printClassNames();
    }
}