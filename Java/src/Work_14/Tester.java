package Work_14;

public class Tester {
    public static void main(String[] args) {
        WaitList<Integer> lst1 = new BoundedWaitList<Integer>(5);
        lst1.add(1);
        lst1.add(3);
        lst1.add(77);
        lst1.add(14);
        System.out.print("Список ожидания с ограниченной ёмкостью (не выход за рамки): " + lst1.content + "\n");

        WaitList<Integer> lst2 = new BoundedWaitList<>(3);
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        System.out.print("Список ожидания с ограниченной ёмкостью (выход за рамки): " + lst2.content + "\n");

        WaitList<Integer> lst3 = new UnfairWaitList<>();
        lst3.content.add(1);
        lst3.content.add(2);
        lst3.content.add(3);
        System.out.print("Список ожидания без ограничений вместимости: " + lst3.content + "\n");
        lst3.content.remove(2);
        lst3.content.remove(3);
        System.out.print("Список ожидания без ограничений вместимости после удаления: " + lst3.content + "\n");

        WaitList<Integer> lst4 = new WaitList<Integer>();
        lst4.content.add(1);
        lst4.content.add(12);
        lst4.content.add(123);
        lst4.content.add(1234);
        lst4.content.add(12345);
        System.out.print("Лист ожидания без апкаста: " + lst4.content + "\n");
        lst4.content.remove(1234);
        System.out.print("Лист ожидания без апкаста после удаления: " + lst4.content + "\n");
        System.out.print("Лист ожидания без апкаста поиск числа 12345 - " + lst4.content.contains(12345) + "\n");
    }
}
