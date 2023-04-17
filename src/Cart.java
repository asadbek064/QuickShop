import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public class Cart implements Subject{
    //properties
    ArrayList<Observer> items;
    Double total;

    public Cart(){
        items = new ArrayList<>();
        total = 0.0;
    }


    //adds item to cart
    @Override
    public void register(Observer newItem) {
        items.add(newItem);
        //allows Observer object to use its methods
        Items item = (Items) newItem;
        total += item.getPrice();
        System.out.println(item.getName()+" was added");
        BigDecimal accuratePrice = new BigDecimal(total).round(new MathContext(3));
        System.out.println("Total = $"+accuratePrice);
    }

    //removes items from cart
    @Override
    public void unregister(Observer deletedItem) {
        items.remove(deletedItem);
        //allows Observer object to use its methods
        Items item = (Items) deletedItem;
        total -= item.getPrice();
        BigDecimal accuratePrice = new BigDecimal(total).round(new MathContext(3));
        System.out.println(item.getName()+" was removed");
        System.out.println("Total = $"+accuratePrice);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : items)
            o.update();
    }
    //notify items to update their inventory
    public void checkout(){
        notifyObserver();
        System.out.println("--------Check Out-------");
        BigDecimal accuratePrice = new BigDecimal(total).round(new MathContext(3));
        System.out.println("The total cost is: $" + accuratePrice);
    }
}
