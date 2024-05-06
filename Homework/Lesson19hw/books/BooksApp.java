package Lesson19hw.books;

import Lesson19hw.books.entity.Author;
import Lesson19hw.books.entity.Book;
import Lesson19hw.books.entity.Genre;
import Lesson19hw.books.repository.AuthorRepository;
import Lesson19hw.books.repository.BookRepository;
import Lesson19hw.books.repository.GenreRepository;
import Lesson19hw.books.service.AuthorService;
import Lesson19hw.books.service.BookService;
import Lesson19hw.books.service.GenreService;

public class BooksApp {
    public static void main(String[] args) {
        Genre[] genres = new Genre[4];
        Author[] authors = new Author[4];
        Book[] books = new Book[14];

        GenreRepository genreRepository = new GenreRepository(genres);
        AuthorRepository authorRepository = new AuthorRepository(authors);
        BookRepository bookRepository = new BookRepository(books);

        GenreService genreService = new GenreService(genreRepository);
        AuthorService authorService = new AuthorService(authorRepository);
        BookService bookService = new BookService(bookRepository, authorRepository, genreRepository);

        authorService.createAuthors();
        System.out.println(authorRepository);
        System.out.println();

        genreService.createGenres();
        System.out.println(genreRepository);
        System.out.println();

        bookService.addNewBook();
        System.out.println(bookRepository);
        System.out.println();
    }
}
