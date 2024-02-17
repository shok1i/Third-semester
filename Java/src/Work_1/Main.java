package Work_1;

// Импорт библиотек
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        num_7();
    }

    // Задание 3
    private static void num_3 () {
        int sum = 0; double average;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ввод размера массива " + "\t");
        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Ввод значения эллемента " + i + "\t");
            array[i] = scan.nextInt();
            sum += array[i];
        }

        average = (double) sum / array.length;

        System.out.println("Сумма эллементов " + sum);
        System.out.format("Среднее значение " + "%.2f", average);
    }

    // Задание 4
    private static void num_4 () {
        int sum = 0, i = 0, mi, ma;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ввод размера массива " + "\t");
        int[] array = new int[scan.nextInt()];

        while (i != array.length)
        {
            System.out.print("Ввод значения эллемента " + i + "\t");
            array[i] = scan.nextInt();
            sum += array[i];
            i++;
        }

        i = 0;
        ma = array[i];
        mi = array[i];

        do
        {
            i++;
            if (ma < array[i]) ma = array[i];
            if (mi > array[i]) mi = array[i];

        } while (i < array.length - 1);

        System.out.println("Сумма эллементов\t" + sum + "\nМинимальное число\t" + mi + "\nМаксимальное число\t" + ma);
    }

    // Задание 5
    private static void num_5 (String[] args) {
        for (String arg : args) System.out.println(arg);
    }

    // Задание 6
    private static void num_6 () {
        double sum = 0;

        for (int i = 1; i <= 10; i++)
        {
            sum += (double) 1 / i;
            System.out.format("\nПозиция в гармоническом ряду " + i + "\tЗначение "+ "%.2f", sum);
        }

    }

    // Задание 7
    private static int factorial (int number) {
        if (number == 1) return 1;
        else return number * factorial(number - 1 );
    }
    private static void num_7 () {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ввод числа " + "\t");
        int number = scan.nextInt();

        if (number == 0) { System.out.print("Значение числа акториала для введенного числа " + 1); }
        else if (number > 27) { System.out.println("Введеное число вызывает переполнение"); }
        else System.out.print("Значение числа акториала для введенного числа " + factorial(number));


    }

}
