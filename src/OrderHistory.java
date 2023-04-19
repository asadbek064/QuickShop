import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderHistory implements OrderHistoryCollection {
    private List<Order> orders;

    public OrderHistory() {
        orders = new ArrayList<>();
    }

    @Override
    public Iterator<Order> createIterator() {
        return new OrderIterator(orders);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }
}