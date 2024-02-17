package Work_2.Number_9;

public class Croupier {
    private Cards[] arm = new Cards[5];

    public void takeCard(CardHolder cardHolder) {
        for (int i = 0; i < 5; i++){
            int position = (int) (Math.random() * 100) % cardHolder.getHolder().size();
            arm[i] = cardHolder.getHolder().get(position);
            cardHolder.delCard(position);
        }
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
