package lab10_mirea;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private Student[] iDNumber = new Student[0];
    public void setArray(Student[] students) {
        iDNumber = students.clone();
    }
    public void outArray() {
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
    @Override
    public int compare(Student first, Student second) {
        if (first.getGPA() > second.getGPA()) {
            return -1;
        }
        else if (first.getGPA() < second.getGPA()) {
            return 1;
        }

        return 0;
    }

    public void quicksort() {
        quicksort(0, iDNumber.length - 1);
    }

    private void quicksort(int left, int right) {
        if (left >= right) {
            return;
        }


        int i = left;
        int j = right;
        Student pivot = iDNumber[left + (right - left) / 2];
        while (i <= j) {
            while (compare(iDNumber[i], pivot) < 0) {
                i++;
            }
            while (compare(iDNumber[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quicksort(left, j);
        }

        if (i < right) {
            quicksort(i, right);
        }
    }

    public void mergeSort() {
        mergeSort(0, iDNumber.length - 1);
    }

    private void mergeSort(int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        mergeSort(left, middle);
        mergeSort(middle + 1, right);
        Student[] temp = new Student[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (compare(iDNumber[i], iDNumber[j]) <= 0) {
                temp[k] = iDNumber[i];
                i++;
            } else {
                temp[k] = iDNumber[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            temp[k] = iDNumber[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = iDNumber[j];
            j++;
            k++;
        }
        for (int index = 0; index < temp.length; index++) {
            iDNumber[left + index] = temp[index];
        }
    }

    public void sortBySurname() {
        for (int i = 1; i < iDNumber.length; i++) {
            Student current = iDNumber[i];
            int j = i - 1;
            while (j >= 0 &&
                    iDNumber[j].getSurname()
                            .compareTo(current.getSurname()) > 0) {

                iDNumber[j + 1] = iDNumber[j];
                j--;
            }
            iDNumber[j + 1] = current;
        }
    }



    public static Student[] mergeLists(
            Student[] first,
            Student[] second
    ) {
        Student[] result =
                new Student[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
        }
        SortingStudents sorter = new SortingStudents();
        sorter.setArray(result);
        sorter.mergeSort();
        return sorter.iDNumber;
    }

    public static void main(String[] args) {
        Student[] first = {new Student(
                        103, "Алексей", "Правин",
                        "Информатика", 2, "КBБО-01", 4.2),

                new Student(
                        101, "Анна", "Краснова",
                        "Информатика", 1, "КBБО-02", 4.9),
                new Student(
                        102, "Пётр", "Иванов",
                        "Информатика", 2, "КBБО-01", 3.8)
        };
        Student[] second = {new Student(
                        105, "Ольга", "Смирнова",
                        "Математика", 1, "МТБО-01", 4.5),
                new Student(
                        104, "Алексей", "Орлов",
                        "Математика", 3, "МТБО-02", 4.7)
        };
        SortingStudents sorter = new SortingStudents();
        sorter.setArray(first);
        System.out.println("Исходный список:");
        sorter.outArray();
        sorter.quicksort();
        System.out.println("\nБыстрая сортировка по баллам:");
        sorter.outArray();
        sorter.setArray(first);
        sorter.mergeSort();
        System.out.println("\nСортировка слиянием по баллам:");
        sorter.outArray();
        sorter.sortBySurname();
        System.out.println("\nПо фамилии:");
        sorter.outArray();
        Student[] combined = mergeLists(first, second);
        sorter.setArray(combined);
        System.out.println("\nОбъединённый список по баллам:");
        sorter.outArray();
    }
}