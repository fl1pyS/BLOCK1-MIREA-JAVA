package BLOCK2.lab11_mirea;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;
    private Date birthDate;

    public Student(
            int iDNumber,
            String name,
            String surname,
            String specialty,
            int course,
            String group,
            double gpa,
            Date birthDate
    ) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        setBirthDate(birthDate);
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

    public Date getBirthDate() {return new Date(birthDate.getTime());}
    public void setBirthDate(Date birthDate) {
        if (birthDate == null) {throw new IllegalArgumentException("Укажите дату рождения");
        }
        this.birthDate = new Date(birthDate.getTime());
    }
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


    public String getBirthDateString(int style) {
        DateFormat format = DateFormat.getDateInstance(style, new Locale("ru", "RU"));
        return format.format(birthDate);
    }

    public String toString(int style) {return iDNumber + ": " + surname + " " + name + ", специальность: " + specialty + ", курс: " + course + ", группа: " + group + ", балл: " + gpa + ", дата рождения: " + getBirthDateString(style);}

    @Override
    public String toString() {
        return toString(DateFormat.MEDIUM);
    }
}
