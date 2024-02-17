package Work_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task_2__Queue {

    public static Queue<Integer> Parse(String cardLine){
        Queue<Integer> cardsStack = new LinkedList<>();
        String[] cardsArray = cardLine.trim().split(" ");

        for (int i = cardsArray.length - 1; i >= 0; i--)
            cardsStack.add(Integer.parseInt(cardsArray[i]));

        return cardsStack;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 cards for the first player (using the space bar)");
//        Stack<Integer> p_1 = Parse(scanner.nextLine());
        Queue<Integer> p_1 = Parse("1 3 5 7 9");

        System.out.println("Enter 5 cards for the second player (using the space bar)");
//        Stack<Integer> p_2 = Parse(scanner.nextLine());
        Queue<Integer> p_2 = Parse("2 4 6 8 0");

        int round = 1;
        while (!p_1.isEmpty() && !p_2.isEmpty()){
//            System.out.println("=========={ Round: " + round  + " }==========");
//            System.out.println("Player 1 cards: " );
//            for (var elem : p_1)
//                System.out.print( elem + " ");
//            System.out.println();
//
//            System.out.println("Player 2 cards: " );
//            for (var elem : p_2)
//                System.out.print( elem + " ");
//            System.out.println();

            if (p_1.peek() > p_2.peek() || p_1.peek() == 0 && p_2.peek() == 9){
//                System.out.println("Player 1 win the round");
                p_1.add(p_2.poll());
            }
            else if (p_2.peek() > p_1.peek() || p_2.peek() == 0 && p_1.peek() == 9) {
//                System.out.println("Player 2 win the round");
                p_2.add(p_1.poll());
            }

            round++;
            if (round == 106)
            {
                System.out.println("BOTVA");
                return;
            }
        }

        System.out.println("============{ END }============");
        if (!p_1.isEmpty())
            System.out.println("Won by the second player after " + (round - 1) + " rounds");
        else
            System.out.println("Won by the first player after " + (round - 1) + " rounds");
    }

}
