package lab6_mirea;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}