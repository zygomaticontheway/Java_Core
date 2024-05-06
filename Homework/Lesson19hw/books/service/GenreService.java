package Lesson19hw.books.service;

import Lesson19hw.books.entity.Genre;
import Lesson19hw.books.repository.GenreRepository;

public class GenreService {
    private GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
    public void createGenres (){
        genreRepository.add(new Genre(1, "Comedy"));
        genreRepository.add(new Genre(2, "Detective"));
        genreRepository.add(new Genre(3, "Horror"));
        genreRepository.add(new Genre(4, "Love story"));
    }
}
