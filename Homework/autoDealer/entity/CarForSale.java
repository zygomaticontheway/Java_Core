package autoDealer.entity;

public class CarForSale extends Car{
    private String vin;
    private Double price;

    public CarForSale(String manufacturer, String model, Integer yearOfManufacture, Integer rating, String vin, Double price) {
        super(manufacturer, model, yearOfManufacture, rating);
        this.vin = vin;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarForSale{" +
                "vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}
