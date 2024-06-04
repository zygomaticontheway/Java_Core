package taskNoteBook;

public class NoteBookDemo {
    public static void main(String[] args) {
      NoteBookInnerClass myNoteBook = new NoteBookInnerClass("MacBook Pro", "Apple");

      NoteBookInnerClass.Monitor monitor = myNoteBook.new Monitor(13);
      NoteBookInnerClass.HDD hdd = myNoteBook.new HDD(1);

        System.out.println(monitor);
        System.out.println(hdd);
        System.out.println(myNoteBook);

      monitor.brightnessUp();
      monitor.brightnessDown();
      hdd.readData();
      monitor.brightnessDown();


    }
}
