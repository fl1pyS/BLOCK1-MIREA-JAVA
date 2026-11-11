package BLOCK2.lab13_mirea.lab13_2_mirea;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;
    public Shirt(String text) {
        String[] parts = text.split(",", -1);
        if (parts.length != 4) {throw new IllegalArgumentException("Нужно 4 поля рубашки");
        }
        code = parts[0].trim();
        name = parts[1].trim();
        color = parts[2].trim();
        size = parts[3].trim();
    }
    @Override
    public String toString() {return "Код: " + code + "\nНазвание: " + name + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
