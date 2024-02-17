package Work_16;

import java.util.Scanner;

public class Exception2 { // Qwerty 0 1.2
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException ex){
            System.out.println("Ошибка получения числа, возможно было введено не число или не целочисленное число.");
        }
        catch (ArithmeticException ex){
            System.out.println("Ошибка деления на ноль, возможно был введен нуль.");
        }
    }
}