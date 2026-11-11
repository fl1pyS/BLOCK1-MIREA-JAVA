package BLOCK2.lab13_mirea.lab13_1_mirea;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;
    private void fillFields(String[] parts) {
        if (parts.length != 7) {throw new IllegalArgumentException("Адрес должен содержать 7 частей");
        }
        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        apartment = parts[6].trim();
    }


    public void parseWithSplit(String text) {
        fillFields(text.split(",", -1));
    }


    public void parseWithTokenizer(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, ",.;", true);

        String[] parts = {"", "", "", "", "", "", ""};
        int index = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (token.equals(",") || token.equals(".") || token.equals(";")) {
                index++;
                if (index >= parts.length) {throw new IllegalArgumentException("Слишком много частей адреса");
                }
            } else {
                parts[index] = token.trim();
            }
        }
        if (index != 6) {throw new IllegalArgumentException("Адрес должен содержать 7 частей");
        }
        fillFields(parts);
    }
    @Override
    public String toString() {return "Страна: " + country + "\nРегион: " + region + "\nГород: " + city + "\nУлица: " + street + "\nДом: " + house + "\nКорпус: " + building + "\nКвартира: " + apartment;
    }
}
