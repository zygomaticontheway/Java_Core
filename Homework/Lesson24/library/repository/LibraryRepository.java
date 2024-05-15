package Lesson24.library.repository;

import Lesson24.library.entity.LibraryElement;

public class LibraryRepository {
    LibraryElement[] libraryElements;
    int count = 0;

    public LibraryRepository(int sizeOurLibrary) {
        this.libraryElements = new LibraryElement[sizeOurLibrary];
    }

    public boolean add (LibraryElement libraryElement){
        if (count < libraryElements.length){
            libraryElements[count++] = libraryElement;
            return true;
        }
        return false;
    }
    public LibraryElement findByTitle(String title){
        for (int i = 0; i < count; i++) {
            if (libraryElements[i].getTitle().equals(title)){
                return libraryElements[i];
            }
        }
        return null;
    }

}
