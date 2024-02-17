package Work_9;

interface Priceable {
    void getPrice();
}

class Clothes implements Priceable{
    String Name;
    int Price;
    public Clothes(String name, int price){
        Name = name; Price = price;
    }
    @Override
    public void getPrice() {
        System.out.println(Name + " { == } " + Price + " €$");
    }
}

class Auto implements Priceable{
    String Name;
    int Price;
    public Auto (String name, int price){
        Name = name; Price = price;
    }
    @Override
    public void getPrice() {
        System.out.println(Name + " { == } " + Price + " €$");
    }
}
public class Task_2 {
    public static void main(String[] args) {
        Priceable clothes = new Clothes("Jacket", 300);
        clothes.getPrice();

        Priceable car = new Auto("Quadra Turbo-R V-Tech", 80000);
        car.getPrice();
    }
}
