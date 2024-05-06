package Lesson19hw.books.repository;

import Lesson19hw.books.entity.Book;

import java.util.Arrays;

public class BookRepository {
    public Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }

    public void add (Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Books array is full");
    }
    public Book findByBookName(String bookName){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)){
                return books[i];
            }
        }
        return null;
    }
    public Book findByIsbn(int isbn){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }
    public Book findByAuthor(String author){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getAuthorName().equals(author)){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
