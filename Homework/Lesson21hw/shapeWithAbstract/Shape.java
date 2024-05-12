package Lesson21hw.shapeWithAbstract;

public abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "title='" + title + '\'' +
                '}';
    }
    void printData(){
        System.out.println('\n' + "===========printing data==========");
    }
}
