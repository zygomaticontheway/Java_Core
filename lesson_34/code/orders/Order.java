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
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Order order) {
        int comparebyOrderID = orderID.compareTo(order.getOrderID());
        if (comparebyOrderID != 0) {
            return comparebyOrderID;
        }
        int comparebyCustomerName = customerName.compareTo(order.getCustomerName());
        if (comparebyCustomerName != 0){
            return comparebyCustomerName;
        }
            return amount.compareTo(order.getAmount());
    }
}
