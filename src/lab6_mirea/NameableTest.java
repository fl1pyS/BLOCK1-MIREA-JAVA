package lab6_mirea;


public class NameableTest {
    public static void main(String[] args) {
        Nameable[] objects = {
                new Planet("Земля"),
                new Planet("Марс"),
                new Animal("Собака", "Рекс"),
                new Animal("Кот", "Барсик")
        };

        for (Nameable object : objects) {
            System.out.println(object.getName());
        }
    }
}
