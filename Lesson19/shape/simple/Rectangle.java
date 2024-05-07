package code.inheritiance.shape.simple;

public class Rectangle {

    private String title;
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        this.title = title;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String getTitle() {
        return title;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        return 2 * ( sideA + sideB );
    }
}
