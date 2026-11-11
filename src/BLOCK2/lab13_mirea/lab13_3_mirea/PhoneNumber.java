package BLOCK2.lab13_mirea.lab13_3_mirea;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        if (number == null) {
            throw new IllegalArgumentException("Номер не задан");
        }
        this.number = number.trim();
    }

    public String getFormattedNumber() {
        String phone = number;
        if (phone.matches("8[0-9]{10}")) {
            phone = "+7" + phone.substring(1);
        } else if (!phone.matches("\\+[0-9]{11,}")) {
            throw new IllegalArgumentException("Неверный формат номера");
        }

        int start = phone.length() - 10;

        return phone.substring(0, start) + phone.substring(start, start + 3) + "-" + phone.substring(start + 3, start + 6) + "-" + phone.substring(start + 6);
    }
}