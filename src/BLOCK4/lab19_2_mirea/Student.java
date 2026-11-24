package BLOCK4.lab19_2_mirea;
public class Student implements StudentRecord {
    private final String fullName;
    private final double gpa;
    public Student(String fullName, double gpa) throws EmptyStringException {
        if (fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не должно быть пустым.");
        }
        this.fullName = fullName.trim();
        this.gpa = gpa;
    }
    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return fullName + ", средний балл: " + gpa;
    }
}
