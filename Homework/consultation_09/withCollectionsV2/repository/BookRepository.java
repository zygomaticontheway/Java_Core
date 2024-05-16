package consultation_09.withCollectionsV2.repository;

import consultation_09.withCollectionsV2.entity.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookRepository {

    List<Book> books = new ArrayList<>();

    public boolean addNewBook(Book book){
        return books.add(book);
    }

    public Book findByISBN(String isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book findById(Integer bookId){
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public Book findByBookName(String bookName){
        for (Book book : books) {
            if (book.getTitle().equals(bookName)) {
                return book;
            }
        }
        return null;
    }


    public List<Book> findByAuthor(String author){
        List<Book> foundedBooks = new LinkedList<>();

        for (Book book : books){
            if (book.getAuthor().equals(author)){
                foundedBooks.add(book);
            }
        }

        return foundedBooks;
    }

    public void printInfo(){
        for (Book book : books){
            System.out.println(book);
        }
    }

}
