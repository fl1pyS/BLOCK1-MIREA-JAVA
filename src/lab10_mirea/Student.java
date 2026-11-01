package lab10_mirea;
public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(
            int iDNumber,
            String name,
            String surname,
            String specialty,
            int course,
            String group,
            double gpa
    ) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getIDNumber() {return iDNumber;}

    public void setIDNumber(int iDNumber) {this.iDNumber = iDNumber;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public String getSpecialty() {return specialty;}
    public void setSpecialty(String specialty) {this.specialty = specialty;}

    public int getCourse() {return course;}
    public void setCourse(int course) {this.course = course;}

    public String getGroup() {return group;}
    public void setGroup(String group) {this.group = group;}

    public double getGPA() {return gpa;}
    public void setGPA(double gpa) {this.gpa = gpa;}

    @Override
    public int compareTo(Student other) {
        if (iDNumber < other.iDNumber) {
            return -1;
        } else if (iDNumber > other.iDNumber) {
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {return iDNumber + ": " + surname + " " + name + ", специальность: " + specialty + ", курс: " + course + ", группа: " + group + ", балл: " + gpa;
    }
}
