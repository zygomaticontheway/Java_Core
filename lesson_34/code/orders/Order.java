package orders;

import java.util.Objects;

//Создайте класс Order с полями orderID, customerName и amount.
public class Order implements Comparable<Order>{
    private Integer orderID;
    private String customerName;
    private Integer amount;

    public Order(Integer orderID, String customerName, Integer amount) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(orderID, order.orderID) && Objects.equals(customerName, order.customerName) && Objects.equals(amount, order.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, customerName, amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Order order) {
        int compareByOrderID = orderID.compareTo(order.getOrderID());
        if (compareByOrderID != 0) {
            return compareByOrderID;
        }
        int compareByCustomerName = customerName.compareTo(order.getCustomerName());
        if (compareByCustomerName != 0){
            return compareByCustomerName;
        }
            return amount.compareTo(order.getAmount());
    }
}
