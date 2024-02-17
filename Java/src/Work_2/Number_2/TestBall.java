package Work_2.Number_2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball test = new Ball(0, 0);
        Scanner scan = new Scanner(System.in);

        System.out.println("Текущая позиция по x и y\t" + test.getX() + " // " + test.getY());

        System.out.println("Введите новую позицию для x:");
        test.setX(scan.nextInt());
        System.out.println(test.toString());

        System.out.println("Введите новую позицию для y:");
        test.setY(scan.nextInt());
        System.out.println(test.toString());

        System.out.println("Введите новые позиции для x и y:");
        test.setXY(scan.nextInt(), scan.nextInt());
        System.out.println(test.toString());

        System.out.println("Введите значения на которое вы хотите передвинуть мячик по x и y:");
        test.move(scan.nextInt(), scan.nextInt());
        System.out.println(test.toString());
    }
}
