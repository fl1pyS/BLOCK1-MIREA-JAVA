package BLOCK4.lab21_4_mirea;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static List<String> listDirectory(String path) {
        String folder = path.trim();
        if (folder.isEmpty()) {
            throw new IllegalArgumentException("Введите путь к каталогу.");
        }

        String[] entries = new File(folder).list();
        if (entries == null) {
            throw new IllegalArgumentException("Не удалось прочитать каталог.");
        }

        List<String> list = new ArrayList<>(Arrays.asList(entries));
        if (list.isEmpty()) {
            System.out.println("Каталог пуст.");
        }
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }
}