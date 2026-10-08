package lab4_mirea;

public class Memory {
    private String type;
    private int capacity;

    public Memory(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity + " GB" +
                '}';
    }
}
