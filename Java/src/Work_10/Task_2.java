package Work_10;

import java.util.Scanner;

public class Task_2{
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) return;
        System.out.print(x + " / ");
        inp.nextInt();
        recursive();
    }
}