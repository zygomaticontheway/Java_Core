package nonInner;

public class BicycleDemo {
    public static void main(String[] args) {
        HandleBar handleBar = new HandleBar();
        Seat seat = new Seat();

        Bicycle bicycle = new Bicycle("model 1", 4, handleBar, seat);

        bicycle.getHandleBar().right();

        // равносильно
        // handleBar.right();

        System.out.println(bicycle);
        System.out.println(handleBar);
        System.out.println(seat);
    }
}
