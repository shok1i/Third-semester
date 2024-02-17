package Work_12;


import java.util.Scanner;
import java.util.Stack;

public class Task_1__Stack {

    public static Stack<Integer> Parse(String cardLine){
        Stack<Integer> cardsStack = new Stack<>();
        String[] cardsArray = cardLine.trim().split(" ");

        for (var card : cardsArray)
            cardsStack.push(Integer.parseInt(card));

        return cardsStack;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 cards for the first player (using the space bar)");
//        Stack<Integer> p_1 = Parse(scanner.nextLine());
        Stack<Integer> p_1 = Parse("1 3 5 7 9");

        System.out.println("Enter 5 cards for the second player (using the space bar)");
//        Stack<Integer> p_2 = Parse(scanner.nextLine());
        Stack<Integer> p_2 = Parse("2 4 6 8 0");

        Stack<Integer> temp = new Stack<>();

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

                while (!p_1.isEmpty())
                    temp.push(p_1.pop());
                temp.push(p_2.pop());

                while (!temp.isEmpty())
                    p_1.push(temp.pop());
            }
            else if (p_2.peek() > p_1.peek() || p_2.peek() == 0 && p_1.peek() == 9) {
//                 System.out.println("Player 2 win the round");

                while (!p_2.isEmpty())
                    temp.push(p_2.pop());
                temp.push(p_1.pop());

                while (!temp.isEmpty())
                    p_2.push(temp.pop());
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
