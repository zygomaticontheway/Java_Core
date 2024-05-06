package Lesson19hw.books.service;

import Lesson18hw.company.UserInput;
import Lesson19hw.books.entity.Author;
import Lesson19hw.books.entity.Book;
import Lesson19hw.books.entity.Genre;
import Lesson19hw.books.repository.AuthorRepository;
import Lesson19hw.books.repository.BookRepository;
import Lesson19hw.books.repository.GenreRepository;

public class BookService {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private GenreRepository genreRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.genreRepository = genreRepository;
    }

    public void addNewBook (){
        UserInput ui = new UserInput();

        String newBookName = ui.inputText("Enter the name of the book:");
        int newIsbn = ui.inputInt("Enter ISBN:");
        int authorId = ui.inputInt("Enter author ID:");
        int genreId = ui.inputInt("Enter genre ID:");

        Author author = authorRepository.findByAuthorId(authorId);
        Genre genre = genreRepository.findByGenreId(genreId);

        Book book = new Book(newBookName, newIsbn, author, genre);

        bookRepository.add(book);
    }
}
