package Work_16;
import java.lang.*;
public class ThrowsDemo{
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        }
        catch (NullPointerException ex){
            System.out.println("Ошибка несуществующей строки.");
        }
    }
}

