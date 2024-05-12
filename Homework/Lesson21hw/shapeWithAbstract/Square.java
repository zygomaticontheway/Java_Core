package Lesson21hw.shapeWithAbstract;

public class Square extends Shape{


    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }


    @Override
    public double calculatePerimeter() {
        return 4 * sideA;
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Square with side: " + sideA);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Square is: " + calculateArea());
    }
}
