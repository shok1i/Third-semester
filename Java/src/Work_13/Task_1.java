package Work_13;

import java.io.*;
import java.util.Scanner;

public class Task_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static File file = new File("src/Work_13/text.txt");

    public static void main(String[] args) {
//        Write();
//        Read();
        Append();
//        Read();
    }

    static void Write (){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("Enter text");
            String temp = scanner.nextLine();
            bufferedWriter.append(temp);
            bufferedWriter.close();
        }
        catch (IOException e) { throw new RuntimeException(e); }
    }
    static void Append (){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("Enter text");
            String temp = scanner.nextLine();
            bufferedWriter.newLine();
            bufferedWriter.append(temp);
            bufferedWriter.close();
        }
        catch (IOException e) { throw new RuntimeException(e); }
    }
    static void Read (){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Text in file");
            String line;
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
            bufferedReader.close();
        }
        catch (IOException e) { throw new RuntimeException(e); }
    }
}
