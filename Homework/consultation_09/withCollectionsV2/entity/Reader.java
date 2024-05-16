package consultation_09.withCollectionsV2.entity;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Integer readerId;
    private String readerName;
    private List<Book> rentedBooks;

    public Reader(Integer readerId, String readerName) {
        this.readerId = readerId;
        this.readerName = readerName;
        this.rentedBooks = new ArrayList<>();
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                ", rentedBooks=" + rentedBooks +
                '}';
    }
}
