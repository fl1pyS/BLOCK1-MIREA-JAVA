package BLOCK4.lab20_2_mirea;

public class Main {
    public static void main(String[] args) {
        GenericBox<String, Integer, Double> box = new GenericBox<>("Java", 10, 2.5);
        System.out.println(box.getFirst());
        System.out.println(box.getSecond());
        System.out.println(box.getThird());
        box.printClassNames();
    }
}
