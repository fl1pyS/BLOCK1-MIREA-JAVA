package lab2_mirea;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players;

        while (true) {
            System.out.print("Введите количество игроков (1–10): ");

            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                scanner.nextLine();

                if (players >= 1 && players <= 10) {
                    break;
                }

                System.out.println("Количество игроков должно быть от 1 до 10");
            } else {
                System.out.println("Ошибка: введите целое число");
                scanner.nextLine();
            }
        }

        String[] suits = {
                "пики", "черви", "бубны", "трефы"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "валет", "дама", "король", "туз"
        };

        String[] deck = new String[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " " + suits[i];
                index++;
            }
        }

        Random random = new Random();

        // Перемешиваем колоду.
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // Раздаём карты по одной каждому игроку.
        for (int player = 0; player < players; player++) {
            System.out.println("Игрок № " + (player + 1));

            for (int round = 0; round < 5; round++) {
                System.out.println(deck[round * players + player]);
            }

            System.out.println();
        }

        scanner.close();
    }
}