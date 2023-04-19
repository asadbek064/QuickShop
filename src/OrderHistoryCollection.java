   import java.util.Iterator;

    public interface OrderHistoryCollection {
        Iterator<Order> createIterator();
        void addOrder(Order order);
    }

