package Work_2.Number_4;


import java.util.Scanner;

public class Start{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Shop store = new Shop();

        store.Add();
        store.Add();
        store.Add();

        System.out.println(store.makeString());

        System.out.print("Удалить PC с именем: ");
        store.delElement(scan.nextLine());
        System.out.println(store.makeString());
    }
}
