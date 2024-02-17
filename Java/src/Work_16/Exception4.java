package Work_16;

import java.util.Scanner;

public class Exception4 { // Qwerty 0 1.2
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch(Exception ex){
            System.out.println("Общее исключение.");
        }
        finally {
            System.out.println("Все прошло успешно!");
        }
    }
}