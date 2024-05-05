package code.library.var1;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private String catalogNumber;

    public Book(String bookName, String bookAuthor, int bookPages, String catalogNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.catalogNumber = catalogNumber;
    }

    public Book(String bookName, String bookAuthor, int bookPages) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }
}
