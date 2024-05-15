package Lesson24.library.entity;

public class Magazine extends LibraryElement {

    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Magazine" + getId() + " '\"'" + getTitle() + " '\"' " + issueNumber);
     }
}
