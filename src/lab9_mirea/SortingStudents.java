package lab9_mirea;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getGPA() > second.getGPA()) {
            return -1;
        } else if (first.getGPA() < second.getGPA()) {
            return 1;
        }
        return 0;
    }

    public void quickSort(Student[] students, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        Student pivot = students[left + (right - left) / 2];
        while (i <= j) {
            while (compare(students[i], pivot) < 0) {
                i++;
            }
            while (compare(students[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;

                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(students, left, j);
        }
        if (i < right) {
            quickSort(students, i, right);
        }
    }
}
