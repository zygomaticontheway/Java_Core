package code.inheritiance.shape.withInheritance;

public class ShapeDemowithInheritance {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1", 5);
        Circle circle2 = new Circle("Circle2", 9);
        Circle circle3 = new Circle("Circle3", 15);


        Circle[] circles = {circle1,circle2,circle3};

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Площадь " + circles[i].getTitle() + ": " + circles[i].calculateArea());
            System.out.println("Периметр " + circles[i].getTitle() + ": " + circles[i].calculatePerimeter());

        }


    }
}
