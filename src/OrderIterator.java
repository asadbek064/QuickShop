import java.util.List;
import java.util.Iterator;

public class OrderIterator implements Iterator<Order> {
    private List<Order> orders;
    private int index;

    public OrderIterator(List<Order> orders) {
        this.orders = orders;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < orders.size();
    }

    @Override
    public Order next() {
        if (hasNext()) {
            return orders.get(index++);
        }
        return null;
    }

    @Override
    public void remove() {
        orders.remove(index - 1);
    }
}