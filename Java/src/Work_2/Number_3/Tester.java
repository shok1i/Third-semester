package Work_2.Number_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Circle> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество кружков: ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Введите координаты центра x/y");
            double x = scan.nextInt(), y = scan.nextInt();
            Circle circle = new Circle();
            circle.setDot(x, y);
            arr.add(circle);
        }

        for (Circle index : arr)
            System.out.println("Координаты центра x/y " + index.getDot().getX() + "/" + index.getDot().getY());


    }
}