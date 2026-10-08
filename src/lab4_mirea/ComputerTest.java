package lab4_mirea;

public class ComputerTest {
    public static void main(String[] args) {
        Processor processor = new Processor(
                "Intel Core i5",
                6,
                2.5
        );

        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor(
                "ASUS VA24",
                23.8,
                1920,
                1080
        );
        Computer computer = new Computer(
                Brand.ASUS,
                "Учебный компьютер",
                processor,
                memory,
                monitor
        );

        System.out.println(computer);
        System.out.println("\nМарка компьютера: " + computer.getBrand());

        System.out.println(
                "Количество ядер: " +
                        computer.getProcessor().getCores()
        );
        System.out.println(
                "Объём памяти: " +
                        computer.getMemory().getCapacity() +
                        " GB");
    }
}
