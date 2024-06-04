package libraryGenerics;

public class LibraryDemo {
    public static void main(String[] args) {
        Library<String> libraryString = new Library();

        libraryString.addBook(new BookGenerics<>("Три мушкетера", "приключения"));
        libraryString.addBook(new BookGenerics<>("Три товарища", "роман"));
        libraryString.addBook(new BookGenerics<>("Три поросенка", "сказка"));

        System.out.println(libraryString.getBooksByGenre("сказка"));

        //================================================

        Genre1 genre1 = new Genre1("роман");
        Genre2 genre2 = new Genre2("приключения");
        Genre3 genre3 = new Genre3("сказка");

        Library<Genre> genreLibrary = new Library<>();
        genreLibrary.addBook(new BookGenerics<>("Три мушкетера", genre2));
        genreLibrary.addBook(new BookGenerics<>("Три товарища", genre1));
        genreLibrary.addBook(new BookGenerics<>("Три поросенка", genre3));

        System.out.println(genreLibrary.getBooksByGenre(genre2));

    }
}
