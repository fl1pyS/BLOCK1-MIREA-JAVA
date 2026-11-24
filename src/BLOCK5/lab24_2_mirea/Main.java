package BLOCK5.lab24_2_mirea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Client client = new Client();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("1 — викторианский, 2 — функциональный, 3 — магический, 0 — выход: ");
                if (!scanner.hasNextLine()) return;

                switch (scanner.nextLine().trim()) {
                    case "1": {
                        VictorianChair chair = factory.createVictorianChair();
                        client.sit(chair);
                        System.out.println("Возраст стула: " + chair.getAge());
                        break;
                    }
                    case "2": {
                        FunctionalChair chair = factory.createFunctionalChair();
                        client.sit(chair);
                        System.out.println("2 + 3 = " + chair.sum(2, 3));
                        break;
                    }
                    case "3": {
                        MagicChair chair = factory.createMagicChair();
                        client.sit(chair);
                        chair.doMagic();
                        break;
                    }
                    case "0":
                        return;
                    default:
                        System.out.println("Выберите число от 0 до 3.");
                }
            }
        }
    }
}