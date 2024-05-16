package consultation_09.withCollectionsV2.repository;


import consultation_09.withCollectionsV2.entity.Book;
import consultation_09.withCollectionsV2.entity.Reader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReaderRepository {

    List<Reader> readers = new ArrayList<>();

    public boolean addNewReader(Reader reader){
        return readers.add(reader);
    }

    public Reader findById(Integer id){
        for (Reader reader : readers){
            if (reader.getReaderId() == id ){
                return reader;
            }
        }
        return null;
    }

    public Book findRentedBook(Book book){
        for (Reader reader : readers){
            List<Book> rentedBooksList = reader.getRentedBooks();
            for (int i = 0; i < rentedBooksList.size(); i++) {
                if (rentedBooksList.get(i) == book ){
                    return rentedBooksList.get(i);
                }
            }
        }
        return null;
    }
    public Book findRentedBookById(Integer id){
        for (Reader reader : readers){
            List<Book> rentedBooksList = reader.getRentedBooks();
            for (int i = 0; i < rentedBooksList.size(); i++) {
                if (rentedBooksList.get(i).getBookId() == id ){
                    return rentedBooksList.get(i);
                }
            }
        }
        return null;
    }
    public Book findRentedBookByTitle(String title){
        for (Reader reader : readers){
            List<Book> rentedBooksList = reader.getRentedBooks();
            for (int i = 0; i < rentedBooksList.size(); i++) {
                if (rentedBooksList.get(i).getTitle().equals(title)){
                    return rentedBooksList.get(i);
                }
            }
        }
        return null;
    }
    public List<Book> findRentedBookByAuthor(String author){
        List<Book> foundedBooks = new LinkedList<>();
        for (Reader reader : readers){
            List<Book> rentedBooksList = reader.getRentedBooks();
            for (int i = 0; i < rentedBooksList.size(); i++) {
                if (rentedBooksList.get(i).getAuthor().equals(author)){
                    foundedBooks.add(rentedBooksList.get(i));
                    return foundedBooks;
                }
            }
        }
        return null;
    }
    public void printInfo(){
        for (Reader reader : readers){
            System.out.println(reader);
        }
    }
    public void printReaders(){
        for (Reader reader : readers){
            System.out.println(reader.getReaderName());
        }
    }

}
