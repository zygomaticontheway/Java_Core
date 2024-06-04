package libraryGenerics;

public class BookGenerics<T> {
    private String title;
    private T genre;

    public BookGenerics(String title, T genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public T getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "BookGenerics{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
