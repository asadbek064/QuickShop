import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

public class Cart implements Subject{
    //properties
    //Items -> # of items in cart
    HashMap<Observer,Integer> items;
    Double total;
    private static Inventory instance;

    private static Cart myCart = null;

    public Cart(Inventory init){
        items = new HashMap<>();
        total = 0.0;
        instance = init;
    }

    public static Cart getInstance() {
        return myCart;
    }

    //adds item to cart
    @Override
    public void register(Observer newItem) {
        items.put(newItem,items.getOrDefault(newItem,0)+1);
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
        if(items.get(deletedItem) == 1) items.remove(deletedItem);
        else
            items.put(deletedItem,items.get(deletedItem)-1);
        //allows Observer object to use its methods
        Items item = (Items) deletedItem;
        total -= item.getPrice();
        BigDecimal accuratePrice = new BigDecimal(total).round(new MathContext(3));
        System.out.println(item.getName()+" was removed");
        System.out.println("Total = $"+accuratePrice);
    }

    @Override
    public void notifyObserver() {
        System.out.println("-------Inventory Updating------");
        for(Observer o : items.keySet())
            o.update(items.get(o));
    }

    public void addToCart(String nameOfItem){
        register(instance.getItemsList().get(nameOfItem));
    }

    public void removeFromCart(String nameOfItem){
        unregister(instance.getItemsList().get(nameOfItem));
    }



    //notify items to update their inventory
    public void checkout(){
        notifyObserver();
        System.out.println("--------Check Out-------");
        BigDecimal accuratePrice = new BigDecimal(total).round(new MathContext(3));
        System.out.println("The total cost is: $" + accuratePrice + "\n");
    }
}
