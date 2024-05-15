package Lesson24.library.entity;

public abstract class LibraryElement {

    private int id;
    private String title;
    private int idReader = 0;

    public LibraryElement(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", idReader=" + idReader +
                '}';
    }

    public abstract void printInfo();
}
