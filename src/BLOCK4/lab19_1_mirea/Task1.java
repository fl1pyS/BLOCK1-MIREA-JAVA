package BLOCK4.lab19_1_mirea;

public class Task1 {
    public static void checkInn(String fullName, String inn)
            throws InvalidInnException {
        if (!fullName.equalsIgnoreCase("Иванов Иван Иванович") || !inn.equals("000000000184")) {
            throw new InvalidInnException("ИНН не соответствует данным клиента.");
        }
    }
}