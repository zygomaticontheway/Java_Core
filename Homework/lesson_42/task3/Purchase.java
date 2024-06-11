package lesson_42.task3;

public class Purchase {
    private String title;
    private Double price;

    public Purchase(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
