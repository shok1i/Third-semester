package Work_11.Number_3;

class MergeSort {


    void merge(Student arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        Student L[] = new Student[n1];
        Student R[] = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getGPA() <= R[j].getGPA()) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(Student arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++)
            students[i] = new Student("Student - " + (i + 1), (int)(Math.random() * 1024 ));

        System.out.println("================{    START    }================");
        for (int i = 0; i < 10; i++)     System.out.println(students[i].toString());

        System.out.println("================{     END     }================");
        new MergeSort().sort(students, 0, students.length - 1);
        for (int i = 0; i < 10; i++)     System.out.println(students[i].toString());
    }
}

class Student {
    private String Name; private int GPA;
    public Student (String name, int gpa){ Name = name; GPA = gpa; }
    public int getGPA() { return GPA; }
    @Override
    public String toString() { return "Name=" + Name + " ==>  GPA=" + GPA; }
}
