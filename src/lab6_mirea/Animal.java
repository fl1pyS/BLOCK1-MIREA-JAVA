package lab6_mirea;


public class Animal implements Nameable {
    private String species;
    private String nickname;

    public Animal(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    @Override
    public String getName() {
        return species + " " + nickname;
    }
}