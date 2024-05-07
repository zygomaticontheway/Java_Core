package code.inheritiance.shape.withInheritance;

public class Shape {
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
}
