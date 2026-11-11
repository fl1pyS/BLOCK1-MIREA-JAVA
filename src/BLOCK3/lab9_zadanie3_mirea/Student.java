package BLOCK3.lab9_zadanie3_mirea;

public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private int gpa;
    public Student(String name, int iDNumber, int gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }
    public int getIDNumber() {return iDNumber;}
    public int getGPA() {return gpa;}


    @Override
    public int compareTo(Student other) {
        if (iDNumber < other.iDNumber) {
            return -1;
        }
        if (iDNumber > other.iDNumber) {
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return name + ", ID: " + iDNumber + ", баллы: " + gpa;
    }
}
