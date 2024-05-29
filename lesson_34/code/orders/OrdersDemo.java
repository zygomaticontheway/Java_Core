package orders;

public class OrdersDemo {
    public static void main(String[] args) {
        OrdersCollection ordersCollection = new OrdersCollection();

        ordersCollection.addNewOrder(new Order(1, "Alex", 100));
        ordersCollection.addNewOrder(new Order(2, "Stanislav", 110));
        ordersCollection.addNewOrder(new Order(3, "Katerina", 120));
        ordersCollection.addNewOrder(new Order(4, "Valerii", 100));
        ordersCollection.addNewOrder(new Order(5, "Varvara", 170));
        ordersCollection.addNewOrder(new Order(6, "Leonid", 50));
        ordersCollection.addNewOrder(new Order(7, "Alex", 170));


        System.out.println("===========================");
        ordersCollection.ordersByAmount();


    }
}
