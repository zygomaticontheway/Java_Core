package Lesson24.library.service;

import Lesson24.library.entity.Book;
import Lesson24.library.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public boolean addBook(Book book) {

        if (book.getId() > 0
                && !book.getTitle().isBlank()
                && book.getId() > 0
                && !book.getAuthor().isBlank()
        ) {
            boolean addResult = repository.add(book);
            return addResult;
        } else {
            return false;
        }
    }
    public Book findById(int id){
        return repository.findById(id);
    }

    public Book findByTitle(String title){
        return repository.findByBookName(title);
    }
    public Book[] findByAuthor(String author){
        return repository.findByAuthor(author);
    }
}
