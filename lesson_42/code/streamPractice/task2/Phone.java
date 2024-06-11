package streamPractice.task2;

public class Phone {

    private String phone;
    private Double price;

    public Phone(String phone, Double price) {
        this.phone = phone;
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", price=" + price +
                '}';
    }
}
