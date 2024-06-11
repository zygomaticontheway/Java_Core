package lesson_42.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OrdersDemo {
    /*
    Задача 3: Преобразование списка объектов и агрегация

Задание: Дан список объектов заказов (Order), где каждый заказ
содержит список покупок (List<Purchase>) и дату заказа.
Каждая покупка содержит название товара и его стоимость.

Необходимо рассчитать общую сумму стоимости всех покупок,
сделанных в текущем месяце.
     */
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase("Brad", 1.99);
        Purchase purchase2 = new Purchase("Milk", 0.95);
        Purchase purchase3 = new Purchase("Eggs", 1.99);
        Purchase purchase4 = new Purchase("Sausage", 3.50);
        Purchase purchase5 = new Purchase("Meet", 8.90);
        Purchase purchase6 = new Purchase("Cheese", 2.45);
        Purchase purchase7 = new Purchase("Beer", 1.15);
        Purchase purchase8 = new Purchase("Juice", 1.70);

        List<Purchase> purchaseList1 = Arrays.asList(purchase1, purchase2);
        List<Purchase> purchaseList2 = Arrays.asList(purchase3, purchase8, purchase5);
        List<Purchase> purchaseList3 = Arrays.asList(purchase4, purchase7, purchase6);

        Order order1 = new Order(purchaseList1, "04 june");
        Order order2 = new Order(purchaseList2, "04 may");
        Order order3 = new Order(purchaseList3, "04 july");

        List<Order> allOrders = Arrays.asList(order1, order2, order3);

        Double totalPrice = allOrders.stream()
                .filter(purchase -> purchase.getDate().contains("may"))
                .flatMapToDouble(purchase -> purchase.getPurchaseList().stream().mapToDouble(Purchase::getPrice))
                .reduce(Double::sum)
                .orElse(0);

        System.out.println(totalPrice);

    }
}
