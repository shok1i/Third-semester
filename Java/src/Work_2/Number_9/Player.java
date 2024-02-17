package Work_2.Number_9;

public class Player {
    private Cards[] arm = new Cards[2];

    public void takeCard(CardHolder cardHolder) {
        int position = (int) (Math.random() * 100) % cardHolder.getHolder().size();
        arm[0] = cardHolder.getHolder().get(position);
        cardHolder.delCard(position);
        position = (int) (Math.random() * 100) % cardHolder.getHolder().size();
        arm[1] = cardHolder.getHolder().get(position);
        cardHolder.delCard(position);
    }

    public String ToStr(){
        String tmp = "";
        for (Cards index : arm)
        {
            tmp += index.getDignity() + "" + index.getSuit() + " | ";
        }
        return tmp;
    }

}
