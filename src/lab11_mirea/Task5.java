package lab11_mirea;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void measure(String name, List<Integer> list) {
        int size = 20000;
        int operations = 1000;
        long start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long addTime = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(list.size() / 2, -i - 1);
        }


        long insertTime = System.nanoTime() - start;
        start = System.nanoTime();

        for (int i = 0; i < operations; i++) {
            list.remove(list.size() / 2);
        }

        long removeTime = System.nanoTime() - start;
        int found = 0;
        start = System.nanoTime();

        for (int i = 0; i < operations; i++) {
            int value = i * size / operations;


            if (list.contains(value)) {
                found++;
            }
        }
        long searchTime = System.nanoTime() - start;
        System.out.println("\n" + name);
        System.out.printf("Добавление: %.3f мс%n", addTime / 1000000.0);
        System.out.printf("Вставка: %.3f мс%n", insertTime / 1000000.0);
        System.out.printf("Удаление: %.3f мс%n", removeTime / 1000000.0);
        System.out.printf("Поиск: %.3f мс%n", searchTime / 1000000.0);
        System.out.println("Найдено элементов: " + found);
    }
    public static void main(String[] args) {
        measure("ArrayList", new ArrayList<Integer>());
        measure("LinkedList", new LinkedList<Integer>());
    }
}
