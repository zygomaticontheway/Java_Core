package lesson_42.task3;

import java.util.List;

public class Order {
    private List<Purchase> purchaseList;
    private String date;

    public Order(List<Purchase> purchaseList, String date) {
        this.purchaseList = purchaseList;
        this.date = date;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "purchaseList=" + purchaseList +
                ", date='" + date + '\'' +
                '}';
    }
}
