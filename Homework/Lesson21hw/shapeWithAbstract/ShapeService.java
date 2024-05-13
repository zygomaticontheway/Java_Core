package Lesson21hw.shapeWithAbstract;

import java.security.PublicKey;
import java.util.Random;


public class ShapeService {
    Random random = new Random();
    private int nameIndex = 0;
    private int shapesArrayLength = random.nextInt(20) + 10;

    public ShapeService() {
    }

    public Shape[] createShapesArray() {
        Shape[] shapes = new Shape[shapesArrayLength];
        System.out.println("Array with length " + shapesArrayLength + " has been created");
        System.out.println("=========================================================");
        return shapes;
    }

    public String createRandomName(String randomName) {
        randomName = randomName + nameIndex++;
        return randomName;
    }

    public Shape[] fillShapesArrayWithRandomShape(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            int randomShape = random.nextInt(4);
            if (shapes[i] == null) {
                switch (randomShape) {
                    case 0:
                        shapes[i] = createRandomCircle(createRandomName("circle"));
                        break;
                    case 1:
                        shapes[i] = createRandomSquare(createRandomName("square"));
                        break;
                    case 2:
                        shapes[i] = createRandomRectangle(createRandomName("rectangle"));
                        break;
                    case 3:
                        shapes[i] = createRandomTriangle(createRandomName("triangle"));
                        break;
                    default:
                        System.out.println("Something went wrong");
                }
            }
        }
        return shapes;
    }

    public Circle createRandomCircle(String circleName) {
        double radius = (double) (Math.random() * (100)) + 1;
        Circle circle = new Circle(circleName, radius);
        System.out.println("A new CIRCLE was created: " +
                '\n' + "Name: " + circleName +
                '\n' + "Radius: " + radius);
        System.out.println();
        return circle;
    }

    public Square createRandomSquare(String squareName) {
        double side = (double) (Math.random() * (100)) + 1;
        Square square = new Square(squareName, side);
        System.out.println("A new SQUARE was created: " +
                '\n' + "Name: " + squareName +
                '\n' + "Side: " + side);
        System.out.println();
        return square;
    }

    public Rectangle createRandomRectangle(String rectangleName) {
        double sideA = (double) (Math.random() * (100)) + 1;
        double sideB = (double) (Math.random() * (100)) + 1;
        Rectangle rectangle = new Rectangle(rectangleName, sideA, sideB);
        System.out.println("A new SQUARE was created: " +
                '\n' + "Name: " + rectangleName +
                '\n' + "Side A: " + sideA +
                '\n' + "Side B: " + sideB);
        System.out.println();
        return rectangle;
    }

    public Triangle createRandomTriangle(String triangleName) {
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        boolean isTriangleValid = (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB);
        do{
             sideA = (double) (Math.random() * (100)) + 1;
             sideB = (double) (Math.random() * (100)) + 1;
             sideC = (double) (Math.random() * (100)) + 1;
         }
         while (isTriangleValid);

        Triangle triangle = new Triangle(triangleName, sideA, sideB, sideC);
        System.out.println("A new TRIANGLE was created: " +
                '\n' + "Name: " + triangleName +
                '\n' + "Side A: " + sideA +
                '\n' + "Side B: " + sideB +
                '\n' + "Side C: " + sideC);
        System.out.println();
        return triangle;
    }

    public void printShapesData(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printData();
        }

    }
}
