package Lesson24.library.repository;

import Lesson24.library.entity.Reader;

import java.util.Arrays;

public class ReaderRepository {
    public Reader[] readers;

    public ReaderRepository(Reader[] readers) {
        this.readers = readers;
    }

    public Reader[] getReaders() {
        return readers;
    }

    public void add (Reader reader){
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                return;
            }
        }
        System.out.println("Readers array is full");
    }
    public Reader findByReaderName(String readerName){
        for (int i = 0; i < readers.length; i++) {
            if (readers[i].getReaderName().equals(readerName)){
                return readers[i];
            }
        }
        return null;
    }
    public Reader findById(int id){
        for (int i = 0; i < readers.length; i++) {
            if (readers[i].getId() == id){
                return readers[i];
            }
        }
        return null;
    }
}
