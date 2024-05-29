package orders;

import java.util.*;

public class OrdersCollection {
    private List<Order> orders;

    public OrdersCollection() {
        this.orders = new ArrayList<>();
    }
    public void addNewOrder(Order newOrder){
        orders.add(newOrder);
        System.out.println("The order # " + newOrder.getOrderID() + " added");
    }
    public void removeOrder(Integer orderId){
        for (Order order : orders){
            if (Objects.equals(order.getOrderID(), orderId)){
                orders.remove(order.getOrderID());
            }
            System.out.println("Order #" + orderId + " was deleted");
        }
        System.out.println("Order #" + orderId + " was not found");
    }
    public Order searchByOrderID (Integer orderId){
        for (Order order : orders){
            if (Objects.equals(order.getOrderID(), orderId)){
                return orders.get(orderId);
            }
        }
        return null;
    }
    public List<Order> searchCustomerName (String customerName){
        List<Order> fidedOrdersByCustomerName = new ArrayList<>();
        for (Order order : orders){
            if (Objects.equals(order.getCustomerName(), customerName)){
                fidedOrdersByCustomerName.add(order);
            }
            System.out.println("Customer " + customerName + " orders: " + '\n' + fidedOrdersByCustomerName);
            return fidedOrdersByCustomerName;
        }
        System.out.println("Customer " + customerName + " has no orders");
        return null;
    }
    public void printOrders (){
        for (Order order : orders){
            System.out.println(order);
        }
    }
    public Map<Integer, Order> ordersByAmount(){
        Map<Integer, Order> ordersByAmount = new TreeMap<>();
        for (Order order : orders){
            Integer key = order.getAmount();
            ordersByAmount.put(key, order);
        }
        System.out.println("=== Orders, sorted by AMOUNT: " + '\n' + ordersByAmount);
        return ordersByAmount;
    }
    public Map<String, Order> ordersByCustomerName(){
        Map<String, Order> ordersByCustomerName = new TreeMap<>();
        for (Order order : orders){
            String key = order.getCustomerName();
            ordersByCustomerName.put(key, order);
        }
        System.out.println("=== Orders, sorted by CUSTOMER NAME: " + '\n' + ordersByCustomerName);
        return ordersByCustomerName;
    }

    @Override
    public String toString() {
        return "OrdersCollection{" +
                "orders=" + orders +
                '}';
    }
}
