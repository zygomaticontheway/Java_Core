package orders;

import java.util.Comparator;

public class OrdersCompareByCustomerName implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2) {
        int compareResult = order1.getCustomerName().compareTo(order2.getCustomerName());
        if (compareResult == 0) {
            compareResult = (-1) * order1.getOrderID().compareTo(order2.getOrderID());
        }
        return compareResult;

    }
}
