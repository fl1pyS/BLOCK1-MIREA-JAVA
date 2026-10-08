package lab4_1_mirea;
public class Student extends Learner {
    private int course;

    public Student(String name, int course) {
        super(name);
        this.course = course;
    }
    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Студент: " + getName() +
                ", курс: " + course;
    }
}