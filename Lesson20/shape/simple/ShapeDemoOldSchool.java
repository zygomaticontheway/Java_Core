package code.inheritiance.shape.simple;

public class ShapeDemoOldSchool {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1", 5);
        Circle circle2 = new Circle("Circle2", 9);
        Circle circle3 = new Circle("Circle3", 15);


        Circle[] circles = {circle1,circle2,circle3};

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Площадь " + circles[i].getTitle() + ": " + circles[i].calculateArea());

        }

        Square square1 = new Square("Square1", 5);
        Square square2 = new Square("Square2", 9);
        Square square3 = new Square("Square3", 15);


        Square[] squares = {square1,square2,square3};

        for (int i = 0; i < squares.length; i++) {
            System.out.println("Площадь " + squares[i].getTitle() + ": " + squares[i].calculateArea());

        }

    }
}
