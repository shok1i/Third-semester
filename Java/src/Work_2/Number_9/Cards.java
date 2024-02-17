package Work_2.Number_9;

public class Cards {
    private char Suit;
    private String Dignity;

    Cards(char suit, String dignity) {
        Suit = suit;
        Dignity = dignity;
    }

    public String getDignity() {
        return Dignity;
    }

    public char getSuit() {
        return Suit;
    }
}
