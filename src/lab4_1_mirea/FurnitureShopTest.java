package lab4_1_mirea;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(2);


        System.out.println("До добавления:");
        shop.printFurniture();
        Furniture table = new Table("Дерево", 15000);
        Furniture chair = new Chair("Металл", 3000);
        shop.addFurniture(table);
        shop.addFurniture(chair);
        System.out.println("\nПосле добавления:");
        shop.printFurniture();
        System.out.println("\nПроверка заполненного магазина:");
        shop.addFurniture(new Chair("Пластик", 1000));
    }
}
