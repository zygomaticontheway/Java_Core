package Lesson19hw.books.entity;

public class Book {
    private String bookName;
    private int isbn;
    private Author author;
    private Genre genre;

    public Book(String bookName, int isbn, Author author, Genre genre) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn=" + isbn +
                ", author=" + author +
                ", genre=" + genre +
                '}';
    }
}
