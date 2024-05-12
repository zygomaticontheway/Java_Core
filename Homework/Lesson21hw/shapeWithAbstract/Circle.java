package Lesson21hw.shapeWithAbstract;


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

    @Override
    void printData() {
        super.printData();
        System.out.println("Circle with radius: " + radius);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Square is: " + calculateArea());
    }
}
