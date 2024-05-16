package consultation_09.withCollectionsV2.service;


import consultation_09.withCollectionsV2.entity.Book;
import consultation_09.withCollectionsV2.repository.BookRepository;

import java.util.List;

public class BookService {

    BookRepository repository;
    Integer counter = 1;


    public BookService(BookRepository repository) {
        this.repository = repository;
    }


    public Book createBook(){
        return new Book(
                counter,
                "ISBN " + counter,
                "Book name # " + counter,
                "author " + counter++
        );
    }

    public boolean addNewBook(Book book){

        boolean addResult = repository.addNewBook(book);
        if (addResult) {
            System.out.println("Книга успешно добавлена, id: " + book.getBookId());
        } else {
            System.out.println("Книгу добавить не удалось");
        }
        return addResult;
    }

    public Book findById(Integer id){
        return repository.findById(id);
    }

    public Book findByTitle(String title){
        return repository.findByBookName(title);
    }

    public List<Book> findByAuthor(String author){
        return repository.findByAuthor(author);
    }

    public void printInfo(){
       repository.printInfo();
    }
}
