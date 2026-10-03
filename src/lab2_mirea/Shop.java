package lab2_mirea;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int size) {
        computers = new Computer[size];
        count = 0;
    }

    public void addComputer(Computer computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;

            System.out.println("Компьютер добавлен");
        } else {
            System.out.println("Магазин заполнен");
        }
    }

    public void removeComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {

                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }

                computers[count - 1] = null;
                count--;

                System.out.println("Компьютер удалён");
                return;
            }
        }

        System.out.println("Компьютер не найден");
    }

    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }

        return null;
    }

    public void printComputers() {
        if (count == 0) {
            System.out.println("В магазине нет компьютеров");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}
