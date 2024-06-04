package taskCar;

public class CarInnerClass {

    private String model;
    private int yearOfManufacture;


    public CarInnerClass(String model, int yearOfManufacture) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }


   public class Door {
        private double length;
       private double height;

       public Door(double length, double height) {
           this.length = length;
           this.height = height;
       }

       public void openDoor(){
           System.out.println("The Door is opened");
       }


       public void closeDoor(){
           System.out.println("The Door is closed");
       }
   }

    @Override
    public String toString() {
        return "NoteBookInnerClassConstructor{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
