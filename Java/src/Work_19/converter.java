package Work_19;
import java.util.List;
import java.util.ArrayList;

public class converter {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = convertArrayToList(integerArray);
        System.out.println("Integer List: " + integerList);
    }
}
