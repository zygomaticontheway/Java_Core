package fruits;

import java.util.Arrays;

public class Fruit {
    private String title;
    private String[] vitamins;
    private int shugar;

    public Fruit(String title, String[] vitamins, int shugar) {
        this.title = title;
        this.vitamins = vitamins;
        this.shugar = shugar;
    }

    public String getTitle() {
        return title;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public int getShugar() {
        return shugar;
    }

    public void printData (){
        System.out.println(title + " is a fruit with:"
                + '\n' + "vitamins: " + Arrays.toString(vitamins)
                + '\n' + "sugar: " + shugar);
    }

}
