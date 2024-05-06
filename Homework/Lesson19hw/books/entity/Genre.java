package Lesson19hw.books.entity;

public class Genre {
    private int genreId;
    private String genre;

    public Genre(int genreId, String genre) {
        this.genreId = genreId;
        this.genre = genre;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", genre='" + genre + '\'' +
                '}';
    }
}
