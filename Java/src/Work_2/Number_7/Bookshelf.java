package Work_2.Number_7;

public class Bookshelf{
    // ArrayList <Book> shelf = new ArrayList<>();

    private Book[] shelf = new Book[256];
    private int bookcount = 0;

    public void addBook(String AuthorName, String BookName, String PublisherName, int WritingYear){

        shelf[bookcount] = new Book();
        shelf[bookcount].setAuthorName(AuthorName);
        shelf[bookcount].setBookName(BookName);
        shelf[bookcount].setPublisherName(PublisherName);
        shelf[bookcount].setWritingYear(WritingYear);

        bookcount++;
    }

    public String shelfInfo(){
        StringBuilder tmp = new StringBuilder(new String());
        for (int i = 0; i < bookcount; i++){
            tmp.append(shelf[i].bookInfo()).append("\n");
        }
        tmp.append("Количество книг на полке ").append(bookcount);
        return tmp.toString();
    }

    public Book miFind(){
        Book tmp = shelf[0];

        for (int i = 0; i < bookcount; i++)
            if(tmp.getWritingYear() < shelf[i].getWritingYear()) tmp = shelf[i];

        return tmp;
    }

    public Book maFind(){
        Book tmp = shelf[0];

        for (int i = 0; i < bookcount; i++)
            if(tmp.getWritingYear() > shelf[i].getWritingYear()) tmp = shelf[i];

        return tmp;
    }

    private void toSwap(int first, int second){
        Book tmp = shelf[first];
        shelf[first] = shelf[second];
        shelf[second] = tmp;
    }

    public void bubbleSorter(){
        for (int out = bookcount - 1; out >= 1; out--)
            for (int in = 0; in < out; in++)
                if(shelf[in].getWritingYear() > shelf[in + 1].getWritingYear()) toSwap(in, in + 1);

    }



}
