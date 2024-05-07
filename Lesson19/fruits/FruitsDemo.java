package fruits;

public class FruitsDemo {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Granny Smith", new String[]{"A", "B1"}, 30, "Green");
        Apple apple2 = new Apple("Golden", new String[]{"A", "B3", "B12"}, 31, "Gold");
        Apple apple3 = new Apple("Beliy naliv", new String[]{"C", "B1", "B12", "C"}, 20, "White");

        Pinapple pineApple1 = new Pinapple("Maroocan", new String[]{"A", "B1", "B12"}, 300, "Sweety");
        Pinapple pineApple2 = new Pinapple("African", new String[]{"B", "C"}, 100, "Stinky");
        Pinapple pineApple3 = new Pinapple("Malasian", new String[]{"PP", "C", "B12"}, 400, "Neutral");

        Fruit [] fruits = {apple1, apple2, apple3, pineApple1, pineApple2, pineApple3};

        for (int i = 0; i < fruits.length; i++) {
            fruits[i].printData();
        }
    }
}
