package fruits;

public class Pinapple extends Fruit{
    public String smell;

    public Pinapple(String title, String[] vitamins, int shugar, String smell) {
        super(title, vitamins, shugar);
        this.smell = smell;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("smell: " + smell);
    }
}
