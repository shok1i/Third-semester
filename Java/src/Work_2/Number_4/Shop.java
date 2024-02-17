package Work_2.Number_4;
import java.util.ArrayList;
import java.util.Scanner;


interface adding{
    void Add();
}

public class Shop implements adding {

    private Scanner scan = new Scanner(System.in);
    private final ArrayList<String> PC_name = new ArrayList<>();

    public void delElement (String pc_name) {
        int pos = searchPC_name(pc_name);
        if (pos == -1) System.out.println("Ошибка нет компьютера с таким названием");
            else PC_name.remove(pos);
    }

    public int searchPC_name (String pc_name) {
        int id = 0;
        for (String name : PC_name){
            int cds = 0;
            for (int i = 0; i < name.length(); i++){
                if (name.charAt(i) != pc_name.charAt(i)) break;
                    else cds++;
            }
            if (cds == pc_name.length()) return id;
            id++;
        }
        return -1;
    }

    public String makeString (){
        String tmp = "";
        for (String name : PC_name){ tmp += name + " // "; }
        return tmp;
    }

    public void Add() {
        System.out.print("Добавить PC с именем: ");
        PC_name.add(scan.nextLine());
    }

}
