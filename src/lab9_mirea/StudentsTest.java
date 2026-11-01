package lab9_mirea;
public class StudentsTest {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;


            while (j >= 0 && students[j].compareTo(current) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }
    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 103, 90),
                new Student("Анна", 101, 78),
                new Student("Пётр", 104, 92),
                new Student("Мария", 102, 85)};
        System.out.println("До сортировки:");
        printStudents(students);
        insertionSort(students);
        System.out.println("\nЗадание 1. По ID по возрастанию:");
        printStudents(students);

        SortingStudents sorter = new SortingStudents();
        sorter.quickSort(students, 0, students.length - 1);
        System.out.println("\nЗадание 2. По баллам по убыванию:");
        printStudents(students);
    }
}
