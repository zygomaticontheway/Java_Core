package Lesson24.library.entity;

import java.util.Arrays;

public class Reader {
    int id;
    String readerName;

    public Reader(int id, String readerName) {
        this.id = id;
        this.readerName = readerName;
    }

    public int getId() {
        return id;
    }

    public String getReaderName() {
        return readerName;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", readerName='" + readerName + '\'' +
                '}';
    }
}
