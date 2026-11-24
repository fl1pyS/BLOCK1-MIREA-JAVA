package BLOCK4.lab18_6_mirea;
public class Task6Tester {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        String[] keys = {"Java", null};

        for (String key : keys) {
            try {
                demo.printMessage(key);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Программа продолжила работу.");
    }
}