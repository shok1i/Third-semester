package Work_6;

abstract class Dish {
    private String Type;
    private String Color;

    public Dish(String type, String color){
        Type = type; Color = color;
    }

    public String getColor() { return Color; }
    public String getType() { return Type; }

    public abstract void useDish();
}

class Plate extends Dish{
    private int Radius;

    public Plate(String color, int radius) {
        super("Plate", color); Radius = radius;
    }

    public int getRadius() { return Radius; }

    @Override
    public void useDish() {
        System.out.println("We are using plate");
    }
}

class Cup extends Dish{
    private int Height;

    public Cup(String color, int height) {
        super("Cup", color); Height = height;
    }

    public int getHeight() { return Height; }

    @Override
    public void useDish() {
        System.out.println("We are using cup");
    }
}

public class Task_1 {

    public static void main(String[] args) {
        Plate plate = new Plate("Green", 15);
        Cup cup = new Cup("White", 10);

        System.out.print(cup.getType() + "  ");
        System.out.print(cup.getColor() + "  ");
        System.out.println(cup.getHeight());
        cup.useDish();

        System.out.print(plate.getType() + "  ");
        System.out.print(plate.getColor() + "  ");
        System.out.println(plate.getRadius());
        plate.useDish();
    }
}
