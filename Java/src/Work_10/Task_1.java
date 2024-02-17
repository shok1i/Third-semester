package Work_10;

import java.util.Scanner;

public class Task_1{
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) return;
        if (x % 2 != 0) System.out.print(x + " / ");
        recursive();
    }
}
