package consultation_09.withCollectionsV2.entity;

public class Book {
    private Integer bookId;
    private String isbn;
    private String title;
    private String author;

    public Book(Integer bookId, String isbn, String title, String author) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
