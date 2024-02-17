package Work_19;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class allContainer<T> {
    private T[] array;

    public allContainer(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
    public static List<String> getDirectoryContent(String directoryPath) {
        List<String> contentList = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (int i = 0; i < 5 && i < files.length; i++) {
                contentList.add(files[i].getName());
            }
        }
        return contentList;
    }

    public static void main(String[] args) {
        allContainer<Integer> intArray = new allContainer<>(5);
        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);
        intArray.set(3, 4);
        intArray.set(4, 5);

        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.length(); i++) {
            System.out.println(intArray.get(i));
        }

        allContainer<String> stringArray = new allContainer<>(3);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        stringArray.set(2, "!");
        System.out.println("String Array:");
        for (int i = 0; i < stringArray.length(); i++) {
            System.out.println(stringArray.get(i));
        }
        String directoryPath = "/home/andrey/git_proj/java/Java/src";
        List<String> directoryContent = getDirectoryContent(directoryPath);
        System.out.println("Directory Content:");
        for (int i = 0; i < 5 && i < directoryContent.size(); i++) {
            System.out.println(directoryContent.get(i));
        }
    }
}