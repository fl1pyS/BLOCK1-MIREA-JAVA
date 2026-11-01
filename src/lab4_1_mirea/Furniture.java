package lab4_1_mirea;

public abstract class Furniture {
    private String material;
    private double price;

    public Furniture(String material, double price) {
        if (material == null || material.isEmpty()) {throw new IllegalArgumentException("Материал не должен быть пустым");}
        if (!Double.isFinite(price) || price < 0) {throw new IllegalArgumentException("Цена должна быть конечной и неотрицательной");
        }
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }
    public double getPrice() {
        return price;
    }
    public abstract String getType();
    @Override
    public String toString() {return getType() + ": материал — " + material + ", цена — " + price;}
}
