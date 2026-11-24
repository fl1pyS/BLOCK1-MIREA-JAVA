package BLOCK5.lab24_2_mirea;
public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }
    public int getAge() { return age; }
    public String getName() { return "викторианский стул"; }
}