package Work_12;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task_3__Dequeue {
    public static Deque<Integer> Parse(String cardLine){
        Deque<Integer> cardsStack = new LinkedList<>();
        String[] cardsArray = cardLine.trim().split(" ");

        for (var card : cardsArray)
            cardsStack.add(Integer.parseInt(card));

        return cardsStack;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 cards for the first player (using the space bar)");
//        Stack<Integer> p_1 = Parse(scanner.nextLine());
        Deque<Integer> p_1 = Parse("1 3 5 7 9");

        System.out.println("Enter 5 cards for the second player (using the space bar)");
//        Stack<Integer> p_2 = Parse(scanner.nextLine());
        Deque<Integer> p_2 = Parse("2 4 6 8 0");

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

            if (p_1.getLast() > p_2.getLast() || p_1.getLast() == 0 && p_2.getLast() == 9){
//                System.out.println("Player 1 win the round");
                p_1.addLast(p_2.pop());
            }
            else if (p_2.getLast() > p_1.getLast() || p_2.getLast() == 0 && p_1.getLast() == 9) {
//                System.out.println("Player 2 win the round");
                p_2.addLast(p_1.pop());
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
