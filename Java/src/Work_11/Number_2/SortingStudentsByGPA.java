package Work_11.Number_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }

    public void quickSort(Student[] array, int low, int high){
        if (array.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        Student temp = array[middle];
        int i = low, j = high;

        while(i <= j){
            while (array[i].getGPA() < temp.getGPA()) i++;
            while (array[j].getGPA() > temp.getGPA()) j--;

            if (i <= j){
                Student tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++; j--;
            }
        }

        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
}
