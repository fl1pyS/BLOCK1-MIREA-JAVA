package lab4_1_mirea;

public class Chair extends Furniture {
    public Chair(String material, double price) {
        super(material, price);
    }

    @Override
    public String getType() {return "Стул";}
}