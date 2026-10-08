package lab4_1_mirea;

public class Learner {
    private String name;
    public Learner(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Учащийся: " + name;
    }
}