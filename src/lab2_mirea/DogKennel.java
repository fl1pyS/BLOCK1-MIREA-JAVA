package lab2_mirea;
import java.util.Scanner;

public class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int size){
        dogs = new Dog[size];
        count = 0;
    }


    public void addDog(Dog dog){
        if(count< dogs.length){
            dogs[count] = dog;
            count++;
        }
        else{
            System.out.println("Питомник переполнен!");
        }
    }

    public void printDogs(){
        if (count == 0){
            System.out.println("Питомник пустой!");
            return;
        }

        for(int i = 0; i<count;i++){
            System.out.println((i+1) +": " + dogs[i]);
        }
    }

    public static int readInt(
            Scanner scanner,
            String message,
            int minimum
    ) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number >= minimum) {
                    return number;
                }

                System.out.println(
                        "Введите число не меньше " + minimum
                );
            } else {
                System.out.println("Введите целое число");
                scanner.nextLine();
            }
        }
    }

    public static String readName(Scanner scanner) {
        while (true) {
            System.out.print("Введите кличку: ");
            String name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Кличка не должна быть пустой");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readInt(
                scanner,
                "Введите количество собак: ",
                1
        );

        DogKennel kennel = new DogKennel(size);

        for (int i = 0; i < size; i++) {
            System.out.println("\nСобака № " + (i + 1));

            String name = readName(scanner);

            int age = readInt(
                    scanner,
                    "Введите возраст в полных годах: ",
                    0
            );

            Dog dog = new Dog(name, age);
            kennel.addDog(dog);
        }

        System.out.println("\nСобаки в питомнике:");
        kennel.printDogs();

        scanner.close();
    }

}
