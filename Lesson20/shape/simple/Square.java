package code.inheritiance.shape.simple;

public class Square {

    private String title;
    private double sideA;

    public Square(String title, double sideA) {
        this.title = title;
        this.sideA = sideA;
    }

    public String getTitle() {
        return title;
    }

    public double getSideA() {
        return sideA;
    }

    public double calculateArea() {
        return sideA * sideA;
    }

    public double calculatePerimeter() {
        return 4 * sideA;
    }
}
