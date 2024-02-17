package Work_17;

import java.util.Arrays;
import java.util.Scanner;

interface StudentInterface{
    double getAverageScore();
    String getName();
}
class Student implements StudentInterface { // САМ СТУДЕНТ
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}
class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(String message){
        super(message);
    }
}
public class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundExeption {
        LabClassUI.start();
    }
}

class LabClassUI{ // ЧАСТЬ ИНТЕРФЕЙСА
    private static Scanner scanner = new Scanner(System.in);

    public static void start() throws EmptyStringException, StudentNotFoundExeption {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        StudentInterface[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            if(name.isEmpty()){ throw new EmptyStringException("Error! Empty name exception");};
            System.out.print("Enter the average score of student " + (i + 1) + ": ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, averageScore);
        }

        while(true){
            System.out.print("Enter variation: \n[1] - Search students by name\n[2] - Sorting students\n---> ");
            int var = scanner.nextInt();
            if(var == 1){
                System.out.print("Enter the name of student: ");
                String name = scanner.nextLine();
                name = scanner.nextLine();
                if(name.isEmpty()) throw new EmptyStringException("Error! Empty name exception");
                boolean checker = true;
                for(int i = 0; i < numStudents;i++){
                    if(name.equals(students[i].getName())){
                        System.out.println("Student was found! His name: " + students[i].getName() + ". His AS: " + students[i].getAverageScore());
                        checker = true;
                        break;
                    }
                    checker = false;
                }
                if(checker == false){
                    throw new StudentNotFoundExeption("Error! Cannot find the student!");
                }
            }
            if(var == 2){
                LabClass.sortByAverageScore(students);
            }
        }
    }
}
class LabClass{ // ЧАСТЬ СРАВНЕНИЙ
    public static void sortByAverageScore(StudentInterface[] students) {
        Arrays.sort(students, (student1, student2) -> {
            if (student1.getAverageScore() < student2.getAverageScore()) {
                return -1;
            } else if (student1.getAverageScore() > student2.getAverageScore()) {
                return 1;
            } else {
                return 0;
            }
        });
    }
}