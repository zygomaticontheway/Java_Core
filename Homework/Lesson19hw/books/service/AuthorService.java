package Lesson19hw.books.service;

import Lesson19hw.books.entity.Author;
import Lesson19hw.books.repository.AuthorRepository;

public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void createAuthors (){
        authorRepository.add(new Author(1,"Eliyahu M. Goldratt"));
        authorRepository.add(new Author(2,"Ayn Rand"));
        authorRepository.add(new Author(3,"Robert Kiyosaki"));
        authorRepository.add(new Author(4,"Nikolay Nosov"));
    }
}
