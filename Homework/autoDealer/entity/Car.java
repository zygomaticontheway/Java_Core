package autoDealer.entity;

public class Car {
    private String manufacturer;
    private String model;
    private Integer yearOfManufacture;
    private Integer rating;


    public Car(String manufacturer, String model, Integer yearOfManufacture, Integer rating) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.rating = rating;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", rating=" + rating +
                '}';
    }
}
