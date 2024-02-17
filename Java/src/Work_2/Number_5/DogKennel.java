package Work_2.Number_5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {

    private static void addDog(int dogsNum, ArrayList<Dog> kennel) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dogsNum; i++){
            System.out.println("Номер собаки в питомнике " + (i+1));
            System.out.print("Введите кличку собаки:  ");
            String name = scan.next();
            System.out.print("Введите возраст собаки: ");
            int age = scan.nextInt();
            Dog tmp = new Dog(name, age);
            kennel.add(tmp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Dog> Kennel = new ArrayList<>();
        int dogs_num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество собак которое вы хотите добавить в реестр: ");
        dogs_num = scan.nextInt();

        addDog(dogs_num, Kennel);

        for (Dog index : Kennel){
            System.out.println(index.ToString());
        }
    }

}
