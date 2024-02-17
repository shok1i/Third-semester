package Work_16;// ЗАДАНИЕ 1

//public class Exception_1 {
//    public void exceptionDemo() {
//        System.out.println( 2 / 0 );
//    }
//}

public class Exception_1 {
     public void exceptionDemo() {
         try{
            System.out.println( 2/0 );
         } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
         }
     }
}



