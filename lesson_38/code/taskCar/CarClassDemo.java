package taskCar;

public class CarClassDemo {
    public static void main(String[] args) {
      CarInnerClass myCar = new CarInnerClass("VW", 2019);

      CarInnerClass.Door door = myCar.new Door(1.5, 1.0);

      door.openDoor();
      door.closeDoor();

    }
}
