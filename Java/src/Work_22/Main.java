package Work_22;


// Интерфейс стула
interface chair {
    void sit();
}
interface AbstractChairFactory{
    Victorianchair createVictorianChair();
    Magicchair createMagicChair();
    Funcionalchair createFunctionalChair();
}

// Реализация Викторианского стула
class Victorianchair extends ChairsFabric implements chair {
    private int age;

    public int getAge() {
        return age;
    }
    public Victorianchair(int age){
        this.age = age;
    }
    @Override
    public void sit() {
        System.out.println("Сел на Викторианский стул.");
    }
}

// Реализация Многофункционального стула
class Funcionalchair extends ChairsFabric implements chair {
    public int sum (int a, int b){
        return a + b;
    }
    @Override
    public void sit() {
        System.out.println("Сел на Многофункциональный стул.");
    }
}

// Реализация Магического стула
class Magicchair extends ChairsFabric implements chair {
    public void doMagic(){
        System.out.println("Maaaagic");
    }
    @Override
    public void sit() {
        System.out.println("Сел на Магический стул.");
    }
}

// Абстрактная фабрика для создания стульев
class ChairsFabric implements AbstractChairFactory{

    @Override
    public Victorianchair createVictorianChair() {
        return new Victorianchair(1);
    }

    @Override
    public Magicchair createMagicChair() {
        return new Magicchair();
    }

    @Override
    public Funcionalchair createFunctionalChair() {
        return new Funcionalchair();
    }
}

class Client{
    public chair Chair;
    public void sit(){
        Chair.sit();
    }

    public void setChair(chair chair) {
        Chair = chair;
    }
}

public class Main {
    public static void main(String[] args) {
        Client cl = new Client();
        ChairsFabric cf = new ChairsFabric();
        Magicchair mc = cf.createMagicChair();
        Funcionalchair fc = cf.createFunctionalChair();
        Victorianchair vc = cf.createVictorianChair();

        cl.setChair(mc);cl.sit();
        cl.setChair(fc);cl.sit();
        cl.setChair(vc);cl.sit();
    }
}