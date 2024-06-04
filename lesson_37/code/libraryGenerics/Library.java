package libraryGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Класс `Library` должен содержать метод `addBook(Book book)`, который добавляет книгу
    в соответствующую коллекцию по жанру.

   Также необходим метод `List<Book> getBooksByGenre(String genre)`,
   который возвращает список книг заданного жанра.
 */
public class Library<T> {

    private Map<T, List<BookGenerics<T>>> booksByGenre = new HashMap<>();

    public void addBook(BookGenerics<T> bookGenerics) {
        List<BookGenerics<T>> books = getBooksByGenre(bookGenerics.getGenre());
        books.add(bookGenerics);
        booksByGenre.put(bookGenerics.getGenre(), books);
    }

    public List<BookGenerics<T>> getBooksByGenre(T genre){
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
    public List<BookGenerics<T>> getBooksByGenre(String genre){

        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
}
