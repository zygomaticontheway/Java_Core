package consultation_09.withCollectionsV2.service;


import consultation_09.withCollectionsV2.entity.Book;
import consultation_09.withCollectionsV2.entity.Reader;
import consultation_09.withCollectionsV2.repository.ReaderRepository;

import java.util.ArrayList;
import java.util.List;

public class ReaderService {

    ReaderRepository repository;
    Integer counter = 1;


    public ReaderService(ReaderRepository repository) {
        this.repository = repository;
    }


    public Reader createReader(){
        return new Reader(
                counter,
                "reader name " + counter++
        );
    }

    public boolean addNewReader(Reader reader){
        
        boolean addResult = repository.addNewReader(reader);
        if (addResult) {
            System.out.println("Читатель успешно добавлен, id: " + reader.getReaderId());
        } else {
            System.out.println("Читателя добавить не удалось");
        }
        return addResult;
    }
    public boolean addRentedBookToReader (Reader reader, Book book){
        List<Book> readersBooks = new ArrayList<>();
        readersBooks = repository.findById(reader.getReaderId()).getRentedBooks();
        readersBooks.add(book);
        System.out.println("Книга " + '\"' + book.getBookId() + '\"' + "успешно выдана");
        return true;
    }

    public Reader findById(Integer readerId){
        return repository.findById(readerId);
    }
    public Book findRentedBook (Book book){
        return repository.findRentedBook(book);
    }

    public void printInfo(){
       repository.printInfo();
    }

//    public void printRentedBooks (){
//        List<Book> readersBooks = new ArrayList<>();
//
//        for (ReaderRepository reader: ) {
//            System.out.println("У пользователя " + reader.getReaderName() +"на руках такие книги:");
//            for (Book book : readersBooks) {
//                System.out.println(repository.findRentedBook(book));
//                System.out.println();
//            }
//        }
//
//    }
}
