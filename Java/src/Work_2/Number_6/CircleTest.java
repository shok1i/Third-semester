package Work_2.Number_6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius_f, radius_s;
        System.out.print("Введите радиус первой окружности: ");
        radius_f = scan.nextDouble();
        System.out.print("Введите радиус второй окружности: ");
        radius_s = scan.nextDouble();

        Circle First = new Circle(radius_f), Second = new Circle(radius_s);

        System.out.println(First.circleCheck(Second));

        System.out.format("Длинна первой окружности: " + "%.2f", First.circleLength());
        System.out.println();
        System.out.format("площадь первой окружности: " + "%.2f", First.circleArea());
        System.out.println();
        System.out.format("Периметр первой окружности: " + "%.2f", First.circlePerimeter());
    }
}
