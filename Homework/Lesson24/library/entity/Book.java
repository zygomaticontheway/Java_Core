package Lesson24.library.entity;

public class Book extends LibraryElement {

    String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void printInfo() {
        System.out.println("Book:" + getId() + " '\"'" + getTitle() + "'\"' " + author);
     }
}
