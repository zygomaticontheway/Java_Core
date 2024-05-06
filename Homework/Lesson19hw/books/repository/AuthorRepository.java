package Lesson19hw.books.repository;

import Lesson19hw.books.entity.Author;

import java.util.Arrays;

public class AuthorRepository {
    public Author[] authors;

    public AuthorRepository(Author[] authors) {
        this.authors = authors;
    }

    public void add (Author author){
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }
        }
        System.out.println("Genres array is full");
    }
    public Author findByAuthorId(int authorId){
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getAuthorId() == authorId){
                return authors[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AuthorRepository{" +
                "authors=" + Arrays.toString(authors) +
                '}';
    }
}
