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
        for (Order order : orders) {
            if (order.getOrderID() == orderId) {
                orders.remove(order);
                System.out.println('\n' + "Order #" + orderId + " was deleted");
                return;
            }
        }
        System.out.println('\n' + "Order #" + orderId + " was not found");
    }
    public Order searchByOrderID (Integer orderId){
        for (Order order : orders){
            if (order.getOrderID() == orderId){
                return order;
            }
        }
        return null;
    }
    public List<Order> searchByCustomerName (String customerName){

        List<Order> fidedOrdersByCustomerName = new ArrayList<>();

        for (Order order : orders){
            System.out.println("~~~~~ checking order.getOrderID()~~~~~~~" + order.getOrderID());
            if (order.getCustomerName().equals(customerName)){
                fidedOrdersByCustomerName.add(order);
            }
        }
        System.out.println('\n' + "Orders of " + customerName + ":" + '\n' + fidedOrdersByCustomerName);
        return fidedOrdersByCustomerName;
    }
    public void printOrders (){
        System.out.println('\n' + "====== Printing orders ======");
        for (Order order : orders){
            System.out.println(order);
        }
    }
    public void printOrders (Set<Order> ordersSet){
        for (Order order : ordersSet){
            System.out.println(order);
        }
    }
    public Set<Order> ordersByAmount(){
        Comparator<Order> comparatorByAmount = new OrdersCompareByAmount();
        Set<Order> ordersByAmount = new TreeSet<>(comparatorByAmount);
        ordersByAmount.addAll(orders);
        System.out.println('\n' + "=== Orders, sorted by AMOUNT: ");
        return ordersByAmount;
    }
    public Set<Order> ordersByCustomerName(){
        Comparator<Order> comparatorByCustomerName = new OrdersCompareByCustomerName();
        Set<Order> ordersByCustomerName = new TreeSet<>(comparatorByCustomerName);
        ordersByCustomerName.addAll(orders);
        System.out.println('\n' + "=== Orders, sorted by CUSTOMER NAME: ");
        return ordersByCustomerName;
    }

    @Override
    public String toString() {
        return "OrdersCollection{" +
                "orders=" + orders +
                '}';
    }
}
