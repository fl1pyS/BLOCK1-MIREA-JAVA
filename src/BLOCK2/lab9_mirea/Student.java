package BLOCK2.lab9_mirea;

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
        if (this.iDNumber < other.iDNumber) {
            return -1;
        } else if (this.iDNumber > other.iDNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {return name + ", ID: " + iDNumber + ", баллы: " + gpa;}
}
