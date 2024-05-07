package code.inheritiance.shape.withInheritance;


public class Circle extends Shape{

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
