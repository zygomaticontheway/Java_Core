package consultation_09.withCollectionsV2.service;



import consultation_09.withCollectionsV2.entity.Book;
import consultation_09.withCollectionsV2.entity.Reader;

public class BookRentService {

    ReaderService readerService;
    BookService bookService;



    public BookRentService(ReaderService readerService, BookService bookService) {
        this.readerService = readerService;
        this.bookService = bookService;
    }

    public boolean rentBook(Reader reader, Book book){

        Book bookForRent = bookService.findById(book.getBookId());

        if (bookForRent == null) {
            System.out.println("Выдать такую книгу невозможно, ее нет в нашей библиотеке!");
            return false;
        }

        Integer readerId = reader.getReaderId();

        if (readerId == null) {
            System.out.println("Выдать такую книгу невозможно, такого читателя нет!");
            return false;
        }

        boolean rentResult = false;
        if(readerService.findRentedBook(book) != book) {
            rentResult = readerService.addRentedBookToReader(reader, book);
        } else {
            System.out.println("Книгу выдать не удалось");
        }
        return rentResult;
    }
}
