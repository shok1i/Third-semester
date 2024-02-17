package Work_15_3;

public class MVCPatternDemo {
    public static void main(String[] args) {
        PersonContoller cont = new PersonContoller();
        cont.setDebt(1200.20);
        cont.updateView();
    }
}
