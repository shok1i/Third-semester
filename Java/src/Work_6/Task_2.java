package Work_6;

abstract class Dog {
    private String Breed;
    private int Age;

    public Dog(String breed, int age){
        Breed = breed; Age = age;
    }

    public int getAge() { return Age; }
    public String getBreed() { return Breed; }

    public abstract void look();
}

class Bulldog extends Dog{
    boolean Sleep;

    public Bulldog(int age, boolean sleep) {
        super("Bulldog", age); Sleep = sleep;
    }

    public boolean isSleep() { return Sleep; }

    @Override
    public void look() {
        System.out.println("The bulldog is asleep");
    }
}

class Terrier extends Dog{
    private int Height;

    public Terrier(int age, int height) {
        super("Terrier", age); Height = height;
    }

    public int getHeight() { return Height; }

    @Override
    public void look() {
        System.out.println("Very small dog");
    }
}

public class Task_2 {

    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog(10, true);
        Terrier terrier = new Terrier(4, 10);

        System.out.print(bulldog.getBreed() + "  ");
        System.out.print(bulldog.getAge() + "  ");
        bulldog.look();

        System.out.print(terrier.getBreed() + "  ");
        System.out.print(terrier.getAge() + "  ");
        terrier.look();
    }
}
