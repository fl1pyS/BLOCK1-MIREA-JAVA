package lab4_mirea;
public class Computer {
    private Brand brand;
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(
            Brand brand,
            String model,
            Processor processor,
            Memory memory,
            Monitor monitor
    ) {this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }



    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "\nbrand=" + brand +
                "\nmodel='" + model + '\'' +
                "\nprocessor=" + processor +
                "\nmemory=" + memory +
                "\nmonitor=" + monitor +
                "\n}";
    }
}
