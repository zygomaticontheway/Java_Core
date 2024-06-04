package innerClass;



public class BicycleInnerClassDemo {
    public static void main(String[] args) {
      BicycleInnerClass myBicycle = new BicycleInnerClass("Super1", 3,40);

      BicycleInnerClass.HandelBar handelBarInner = myBicycle.new HandelBar(true);
      BicycleInnerClass.Seat seatInner = myBicycle.new Seat();

      handelBarInner.right();
      seatInner.up();

        System.out.println(myBicycle);
        System.out.println(handelBarInner);
        System.out.println(seatInner);

        seatInner.getSeatParam();

    }
}
