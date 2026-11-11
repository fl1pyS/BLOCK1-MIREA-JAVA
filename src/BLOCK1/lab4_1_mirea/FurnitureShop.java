package BLOCK1.lab4_1_mirea;

public class FurnitureShop {
    private Furniture[] furniture;
    private int count;

    public FurnitureShop(int size) {
        if (size <= 0) {throw new IllegalArgumentException("Размер магазина должен быть больше нуля");}
        furniture = new Furniture[size];
        count = 0;
    }

    public void addFurniture(Furniture item) {
        if (item == null) {throw new IllegalArgumentException("Нельзя добавить null вместо мебели");}
        if (count < furniture.length) {
            furniture[count] = item;
            count++;
        } else {
            System.out.println("Магазин заполнен");}
    }



    public void printFurniture() {
        if (count == 0) {
            System.out.println("Магазин пуст");
            return;}
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + furniture[i]);}
    }
}
