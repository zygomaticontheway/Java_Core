package orders;

import java.util.Comparator;

public class OrdersCompareByAmount implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2) {
        int compareResult = order1.getAmount() - order2.getAmount();
        if (compareResult == 0) {
            compareResult = (-1) * order1.getCustomerName().compareTo(order2.getCustomerName());
        }
        return compareResult;

    }
}
