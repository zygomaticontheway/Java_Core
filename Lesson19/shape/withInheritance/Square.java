package code.inheritiance.shape.withInheritance;

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
}
