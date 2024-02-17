package Work_2.Number_8;

public class Stroks {
    public static void main(String[] args) {
        String[]  strArray = {"Pipi", "Pupu",  "PiiiPii", "PuuPuu", "PiiPuu", "123", "312"};

        System.out.println("Первоначальная строка");
        for (String index : strArray)
            System.out.print(index + " ");

        for (int i = 0; i < strArray.length / 2; i++){

            String tmp_1 = strArray[i];
            String tmp_2 = strArray[strArray.length - i - 1];

            strArray[strArray.length - i - 1] = tmp_1;
            strArray[i] = tmp_2;
        }

        System.out.println("\nСтрока после переворота");
        for (String index : strArray)
            System.out.print(index + " ");
    }
}
