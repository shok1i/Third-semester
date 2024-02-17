package Work_12;

class Node {
    int Data;
    Node Prev;
    Node Next;

    public Node (int data) {
        Data = data;
        Prev = null; Next = null;
    }
}
class DoubleList{
    Node Head;
    Node Tail;

    public DoubleList(){
        Head = null; Tail = null;
    }

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        if (Head == null) {
            Head = temp;
            Tail = temp;
        }
        else {
            temp.Next = Head;
            Head.Prev = temp;
            Head = temp;
        }
    }
    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (Tail == null) {
            Head = temp;
            Tail = temp;
        }
        else {
            Tail.Next = temp;
            temp.Prev = Tail;
            Tail = temp;
        }
    }

    public void deleteAtEnd() {
        if (Tail == null)
            return;

        if (Head == Tail) {
            Head = null;
            Tail = null;
            return;
        }

        Node temp = Tail;
        Tail = Tail.Prev;
        Tail.Next = null;
        temp.Prev = null;
    }
}
public class Task_4__DoubleList {
    public static DoubleList Parse(String cardLine){
        DoubleList cardsStack = new DoubleList();
        String[] cardsArray = cardLine.trim().split(" ");

        for (var card : cardsArray)
            cardsStack.insertAtEnd(Integer.parseInt(card));

        return cardsStack;
    }

    public static void main(String[] args) {
        DoubleList P_1 = Parse("1 3 5 7 9");
        DoubleList P_2 = Parse("2 4 6 8 0");

        int round = 1;
        while (P_1.Head != null && P_2.Head != null){
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

            if (P_1.Tail.Data > P_2.Tail.Data || P_1.Tail.Data == 0 && P_2.Tail.Data == 9){
//                System.out.println("Player 1 win the round");
                P_1.insertAtBeginning(P_2.Tail.Data);
                P_2.deleteAtEnd();
            }
            else if (P_1.Tail.Data < P_2.Tail.Data || P_2.Tail.Data == 0 && P_1.Tail.Data == 9) {
//                System.out.println("Player 2 win the round");
                P_2.insertAtBeginning(P_1.Tail.Data);
                P_1.deleteAtEnd();
            }

            round++;
            if (round == 106)
            {
                System.out.println("BOTVA");
                return;
            }
        }

        System.out.println("============{ END }============");
        if (P_1.Head != null)
            System.out.println("Won by the second player after " + (round - 1) + " rounds");
        else
            System.out.println("Won by the first player after " + (round - 1) + " rounds");
    }
}
