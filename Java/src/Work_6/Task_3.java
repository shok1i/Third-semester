package Work_6;

import java.util.ArrayList;
import java.util.List;

abstract class Furniture{
    private String Type;
    private int Weight, Cost;

    public Furniture(String type, int weight, int cost){
        Type = type; Weight = weight; Cost = cost;
    }

    public int getWeight() { return Weight; }

    public int getCost() { return Cost; }
}

class Sofa extends Furniture{
    public Sofa (int weight, int cost){
        super("Sofa", weight, cost);
    }

    @Override
    public String toString() {
        return "Sofa:  \n\tCost: " + getCost() + ", Weight: " + getWeight();
    }
}

class Chair extends Furniture {
    public Chair(int weight, int cost) {
        super("Chair", weight, cost);
    }

    @Override
    public String toString() {
        return "Chair: \n\tCost: " + getCost() + ", Weight: " + getWeight();
    }
}

public class Task_3 {
    public static void main(String[] args) {
        List<Furniture> Shop = new ArrayList<>();

        Shop.add(new Sofa(120, 20000));
        Shop.add(new Chair(10, 3000));
        for (var item : Shop)
            System.out.println(item);
    }
}
