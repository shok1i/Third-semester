package Work_11.Number_2;

public class Tester {

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++)
            students[i] = new Student("Student - " + (i + 1), (int)(Math.random() * 1024 ));

        System.out.println("================{    START    }================");
        for (int i = 0; i < 10; i++)     System.out.println(students[i].toString());

        System.out.println("================{     END     }================");
        new SortingStudentsByGPA().quickSort(students, 0, students.length - 1);
        for (int i = 0; i < 10; i++)     System.out.println(students[i].toString());
    }
}
