package Lesson24.library.repository;

import Lesson24.library.entity.Book;
import Lesson24.library.entity.Magazine;

import java.util.Arrays;

public class MagazineRepository {
    private Magazine[] magazines;
    private int count = 0;
    private LibraryRepository libraryRepository;

    public MagazineRepository(int sizeOurMagazines, LibraryRepository libraryRepository) {
        this.magazines = new Magazine[sizeOurMagazines];
        this.libraryRepository = libraryRepository;
    }

    public boolean add (Magazine magazine){
        if (count < magazines.length){
            magazines[count++] = magazine;
            libraryRepository.add(magazine);
            return true;
        }
        return false;
    }
    public Magazine findByMagazineName(String magazineName){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i].getTitle().equals(magazineName)){
                return magazines[i];
            }
        }
        return null;
    }
    public Magazine findByIssueNumber(int issueNumber){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i].getIssueNumber() == issueNumber){
                return magazines[i];
            }
        }
        return null;
    }

    public Magazine findById(int id){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i].getId() == id){
                return magazines[i];
            }
        }
        return null;
    }
}
