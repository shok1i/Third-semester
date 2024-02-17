package Work_2.Number_10;

import java.util.Scanner;

public class HowManyJava {
    public static void main(String[] args) {
        int wordsNumber = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') wordsNumber++;
            if (str.charAt(i) == '-') wordsNumber--;
        }
        System.out.println("Количество слов в введеное в консль: " + wordsNumber);
    }
}
