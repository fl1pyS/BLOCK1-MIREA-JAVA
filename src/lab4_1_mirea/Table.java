package lab4_1_mirea;

public class Table extends Furniture {
    public Table(String material, double price) {
        super(material, price);
    }
    @Override
    public String getType() {return "Стол";}
}
