package BLOCK4.lab19_2_mirea;

public class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException {
        StudentRecord[] students = {new Student("Иванов Иван Иванович", 4.2), new Student("Петрова Анна Сергеевна", 4.9), new Student("Сидоров Пётр Олегович", 3.8)};
        LabClass group = new LabClass(students);
        new LabClassUI().run(group);
    }
}