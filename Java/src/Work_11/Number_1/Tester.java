package Work_11.Number_1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++)
            students[i] = new Student("Student - " + (int)(Math.random() * 128 ), (int)(Math.random() * 1024 ));

        System.out.println("================{    START    }================");
        for (int i = 0; i < 5; i++)     System.out.println(students[i].toString());
        System.out.println("================{     END     }================");
        arrSort(students);
        for (int i = 0; i < 5; i++)     System.out.println(students[i].toString());
    }

    // Function for sorting array of Students
    private static void arrSort(Student[] students){
        int arrSize = students.length;

        for (int i = 0; i < arrSize; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()){
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

}
