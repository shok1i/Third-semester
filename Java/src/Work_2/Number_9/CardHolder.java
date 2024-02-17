package Work_2.Number_9;

import java.util.ArrayList;

public class CardHolder {
    private ArrayList<Cards> Holder = new ArrayList<>();

    public void addCard(Cards cards) {
        Holder.add(cards);
    }

    public void delCard(int index) {
        Holder.remove(index);
    }

    public ArrayList<Cards> getHolder() {
        return Holder;
    }
}
