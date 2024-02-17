package task13;
import java.io.*;
import java.util.Scanner;

public class file_W {
    public static void main(String[] args) {
        file wf = new file("C:\\Users\\Rossi\\IdeaProjects\\second_half\\src\\task13\\test.txt");
        Scanner scan = new Scanner(System.in);
        wf.write(scan.nextLine());
        file rf = new file("C:\\Users\\Rossi\\IdeaProjects\\second_half\\src\\task13\\test.txt");
        rf.read();
        wf.reWrite(scan.nextLine());
        wf.append("КисиМиси");
    }
}

class file{
    private String file_path;
    file(String text){
        this.file_path = text;
    }
    public void write(String text){
        try(FileWriter w_file = new FileWriter(file_path)){
            w_file.write(text);
            w_file.append("\n");
        }
        catch(IOException ex){
            System.out.printf(ex.getMessage());
        }
    }
    public void read(){
        int elem;
        try(FileReader r_file = new FileReader(file_path)){
            while((elem = r_file.read()) != -1){
                System.out.print((char)elem);
            }
        }
        catch(IOException ex){
            System.out.printf(ex.getMessage());
        }
    }
    public void reWrite(String text){
        try(FileWriter w_file = new FileWriter(file_path, false)){
            w_file.write(text);
            w_file.append("\n");
        }
        catch(IOException ex){
            System.out.printf(ex.getMessage());
        }
    }
    public void append(String text){
        try(FileWriter w_file = new FileWriter(file_path,true)){
            w_file.write(text);
            w_file.append("\n");
        }
        catch(IOException ex){
            System.out.printf(ex.getMessage());
        }
    }
}
