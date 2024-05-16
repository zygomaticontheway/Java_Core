package consultation_09.withCollectionsV2;


import consultation_09.withCollectionsV2.entity.Book;
import consultation_09.withCollectionsV2.entity.Reader;
import consultation_09.withCollectionsV2.repository.BookRepository;
import consultation_09.withCollectionsV2.repository.ReaderRepository;
import consultation_09.withCollectionsV2.service.BookRentService;
import consultation_09.withCollectionsV2.service.BookService;
import consultation_09.withCollectionsV2.service.ReaderService;

public class LibraryApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        ReaderRepository readerRepository = new ReaderRepository();
        BookService bookService = new BookService(bookRepository);
        ReaderService readerService = new ReaderService(readerRepository);

        BookRentService bookRentService = new BookRentService(readerService, bookService);

        for (int i = 0; i < 50; i++) {
            Book newBook = bookService.createBook();
            bookService.addNewBook(newBook);
        }

        for (int i = 0; i < 10; i++) {
            Reader newReader = readerService.createReader();
            readerService.addNewReader(newReader);
        }

//        это работает только до 5 книг, нужно больше времени, чтобы размножить книги дальше
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                    bookRentService.rentBook(readerService.findById(i), bookService.findById(j));
            }
        }


        System.out.println("========= Список созданных книг =========");
        bookService.printInfo();

        System.out.println("========= Список созданных читателей =========");
        readerService.printInfo();


    }
}
