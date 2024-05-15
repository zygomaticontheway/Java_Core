package Lesson24.library.repository;

import Lesson24.library.entity.Book;

import java.util.Arrays;

public class BookRepository {
    private Book[] books;
    private int count = 0;
    private LibraryRepository libraryRepository;

    public BookRepository(int sizeOurBooks, LibraryRepository libraryRepository) {
        this.books = new Book[sizeOurBooks];
        this.libraryRepository = libraryRepository;
    }

    public boolean add (Book book){
        if (count < books.length){
            books[count] = book;
            count++;
            // books[count++] = book; - сперва кладем в массив с индексом count ссылку на книгу, а потом увеличиваем count на 1
            // books[++count] = book;- сперва увеличиваем count на 1, а затем в массив с индексом count записываем ссылку на книгу
            libraryRepository.add(book);
            return true;
        }
        return false;
    }

    public Book findByBookName(String bookName){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(bookName)){
                return books[i];
            }
        }
        return null;
    }
    public Book findById(int id){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id){
                return books[i];
            }
        }
        return null;
    }
    public Book [] findByAuthor(String authorForSearch){
        Book[] booksSearchResult = new Book[count];
        int serchCount = 0;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().equals(authorForSearch)){
                booksSearchResult [serchCount++] = books[i];
            }
        }
        return booksSearchResult;
    }

}
