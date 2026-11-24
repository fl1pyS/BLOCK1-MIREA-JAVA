package BLOCK4.lab18_6_mirea;
public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("Ключ равен null.");
        }
        return "Данные для ключа: " + key;
    }
}