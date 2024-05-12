package Lesson21hw.shapeWithAbstract;



public class ShapeDemowithInheritance {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();

        Shape[] shapes = shapeService.createShapesArray();

        shapeService.fillShapesArrayWithRandomShape(shapes);

        shapeService.printShapesData(shapes);


    }
}
