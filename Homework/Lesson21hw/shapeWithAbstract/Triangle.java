package Lesson21hw.shapeWithAbstract;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }



    @Override
    public double calculateArea() {
        double p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
    @Override
    void printData() {
        super.printData();
        System.out.println("Triangle with sides: " +
                '\n' + "A " + sideA +
                '\n' + "B " + sideB +
                '\n' + "C " + sideC);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Square is: " + calculateArea());
    }
}
