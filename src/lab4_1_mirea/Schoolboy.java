package lab4_1_mirea;
public class Schoolboy extends Learner {
    private int grade;

    public Schoolboy(String name, int grade) {
        super(name);
        this.grade = grade;
    }



    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Школьник: " + getName() +
                ", класс: " + grade;
    }
}
