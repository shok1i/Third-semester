package Work_16;

public class ThrowsDemo6 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(
                    message);
        }
        catch (NullPointerException ex){
            System.out.println("Ошибка не существующего объекта");
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}
