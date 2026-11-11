package BLOCK3.lab9_zadanie3_mirea;
public class Main {
    public static void main(String[] args) {
        Student[] first = {
                new Student("Иван", 103, 90),
                new Student("Анна", 101, 78)
        };
        Student[] second = {
                new Student("Пётр", 104, 92),
                new Student("Мария", 102, 85)
        };
        System.out.println("\nПервый список: ");
        for(Student student : first){
            System.out.println(student);
        }
        System.out.println("\nВторой список: ");
        for(Student student : second){
            System.out.println(student);
        }
        System.out.println("\nОбъединённый список: ");
        Student[] sorted = MergeSort.combine(first, second);
        for (Student student : sorted) {
            System.out.println(student);
        }
    }
}