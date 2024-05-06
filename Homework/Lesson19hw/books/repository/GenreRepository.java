package Lesson19hw.books.repository;

import Lesson19hw.books.entity.Genre;

import java.util.Arrays;

public class GenreRepository {
    public Genre[] genres;

    public GenreRepository (Genre[] genres) {
        this.genres = genres;
    }
    public void add (Genre genre){
        for (int i = 0; i < genres.length; i++) {
            if (genres[i] == null) {
                genres[i] = genre;
                return;
            }
        }
        System.out.println("Genres array is full");
    }
    public Genre findByGenreId(int genreId){
        for (int i = 0; i < genres.length; i++) {
            if (genres[i].getGenreId() == genreId){
                return genres[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GenreRepository{" +
                "genres=" + Arrays.toString(genres) +
                '}';
    }
}
