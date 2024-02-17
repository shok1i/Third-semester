package Work_17;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String fullName;
        String INN;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        fullName = scan.nextLine();
        System.out.print("Enter INN: ");
        try {
            INN = scan.nextLine();
            validateINN(INN);
        }
        catch (INNError e) {
            throw new RuntimeException(e);
        }
        System.out.println("All good!");
    }
    public static void validateINN(String INN) throws INNError {
        if(INN.length() != 10){
            throw new INNError("INN Error, not enough length");
        }
        for(char ch : INN.toCharArray()){
            if(!Character.isDigit(ch)){
                throw new INNError("INN Error, not a number");
            }
        }
    }
}


class INNError extends Exception {
    public INNError(String errorMessage) {
        super(errorMessage);
    }
}