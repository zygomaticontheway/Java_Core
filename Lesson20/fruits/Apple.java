package fruits;

public class Apple extends Fruit{
    private String color;

    public Apple(String title, String[] vitamins, int shugar, String color) {
        super(title, vitamins, shugar);
        this.color = color;
    }

    @Override
    public void printData() {
        super.printData(); //выполни так как у родителя
        System.out.println("color: " + color);
    }
}
