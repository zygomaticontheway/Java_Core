package Lesson21hw.shapeWithAbstract;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * ( sideA + sideB );
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Rectangle with sides: " +
                '\n' + "A " + sideA +
                '\n' + "B " + sideB);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Square is: " + calculateArea());
    }
}
