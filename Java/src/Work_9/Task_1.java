package Work_9;

interface Nameable {
    void getName();
}

class Planet implements Nameable{
    String Name;

    public Planet(String name){
        Name = name;
    }

    @Override
    public void getName() {
        System.out.println(Name);
    }
}

class Car implements Nameable{
    String Name;

    public Car (String name){
        Name = name;
    }

    @Override
    public void getName() {
        System.out.println(Name);
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        planet.getName();

        Nameable car = new Car("Quadra Turbo-R V-Tech");
        car.getName();
    }
}
