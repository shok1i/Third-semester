package Work_16;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = "";
            printDetails(key);
        }
        catch(Exception ex){
            while(true){
                try {
                    System.out.println("Была получена ошибка. Введите другое значение: ");
                    String key = myScanner.nextLine();
                    printDetails(key);
                }
                catch (Exception ex1){
                }
                return;
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
