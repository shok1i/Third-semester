package Work_2.Number_7;

public class Book {
    private String AuthorName = "null", BookName = "null", PublisherName = "null";
    private int WritingYear = 0;

    public void setAuthorName(String authorName) { AuthorName = authorName; }
    public void setBookName(String bookName) { BookName = bookName; }
    public void setPublisherName(String publisherName) { PublisherName = publisherName; }
    public void setWritingYear(int writingYear) { WritingYear = writingYear; }

    public int getWritingYear() { return WritingYear; }

    public String bookInfo(){ return AuthorName + " " + BookName + " " + WritingYear + " " + PublisherName; }


}
