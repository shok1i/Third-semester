package Work_2.Number_7;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();

        shelf.addBook("Author 0", "Book 0", "Publisher 0", 1990);
        shelf.addBook("Author 1", "Book 1", "Publisher 1", 2020);
        shelf.addBook("Author 2", "Book 2", "Publisher 2", 2077);
        shelf.addBook("Author 3", "Book 3", "Publisher 3", 1974);

        System.out.println("Первоначальная полка");
        System.out.println(shelf.shelfInfo());

        System.out.println("Самая новая книга");
        System.out.println(shelf.miFind().bookInfo());

        System.out.println("Самая старая книга");
        System.out.println(shelf.maFind().bookInfo());
        shelf.bubbleSorter();

        System.out.println("Полка после сортировки по возрастанию года выпуска");
        System.out.println(shelf.shelfInfo());
    }
}
