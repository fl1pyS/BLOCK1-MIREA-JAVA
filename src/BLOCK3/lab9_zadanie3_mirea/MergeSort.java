package BLOCK3.lab9_zadanie3_mirea;


public class MergeSort {
    public static Student[] mergeSort(Student[] students) {
        if (students.length <= 1) {
            return students;
        }
        int middle = students.length / 2;
        Student[] left = new Student[middle];
        Student[] right = new Student[students.length - middle];
        for (int i = 0; i < left.length; i++) {
            left[i] = students[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = students[middle + i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }




    public static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;

    }


    public static Student[] combine(Student[] first, Student[] second) {
        Student[] combined = new Student[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            combined[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            combined[first.length + i] = second[i];
        }
        return mergeSort(combined);
    }
}
