package autoDealer.repository;

import autoDealer.entity.Car;
import autoDealer.entity.CarForSale;

import java.util.HashMap;
import java.util.Map;

public class CarDealer {
    Map<String, CarForSale> database;

    public CarDealer() {
        this.database = new HashMap<>();
    }

    public Map<String, CarForSale> getDatabase() {
        return database;
    }
    public Map<String, CarForSale> addCar (CarForSale newCar){
        database.put(newCar.getVin(), newCar);
        return database;
    }

    public boolean removeCar (CarForSale carForRemove){
        if (database.containsKey(carForRemove.getVin())){
            database.remove(carForRemove.getVin());
            return true;
        }
        return false;
    }

    public boolean changePrice (CarForSale carForChange, Double newPrice){
        if (database.containsKey(carForChange.getVin())){
            database.get(carForChange.getVin()).se;
            return true;
        }
        return false;
    }
    public boolean changeRating (Car carForChange, Integer newRating){
        if (database.containsKey(carForChange.getVin())){
            database.get(carForChange.getVin()).setRating(newRating);
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "CarDealer{" +
                "database=" + database +
                '}';
    }
}
