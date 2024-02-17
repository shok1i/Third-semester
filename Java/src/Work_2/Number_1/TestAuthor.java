package Work_2.Number_1;

import java.util.Scanner;

public class TestAuthor {

    public static void main(String[] args) {
        Author test = new Author ("Боб", "inbox@inbox.com", 'м');
        System.out.println("Имя автора :\t" + test.getName());
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите почту :\t");
        test.setInbox(scan.nextLine());
        System.out.println(test.toString());

    }
}