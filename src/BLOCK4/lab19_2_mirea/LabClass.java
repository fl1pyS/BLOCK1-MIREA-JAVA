package BLOCK4.lab19_2_mirea;
import java.util.Arrays;

public class LabClass {
    private final StudentRecord[] students;
    public LabClass(StudentRecord[] students) {
        this.students = students;
    }
    public void sortByGpa() {
        Arrays.sort(students, (a, b) -> Double.compare(b.getGpa(), a.getGpa()));
    }
    public StudentRecord find(String fullName)
            throws EmptyStringException, StudentNotFoundException {
        String name = fullName.trim();
        if (name.isEmpty()) {
            throw new EmptyStringException("Введите ФИО.");
        }
        for (StudentRecord student : students) {
            if (student.getFullName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент не найден: " + name);
    }
    public void print() {
        for (StudentRecord student : students) {
            System.out.println(student);
        }
    }
}