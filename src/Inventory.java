import java.util.HashMap;
//maintains a list of the websites inventory
public class Inventory{
    public HashMap<String, Items> itemsList = new HashMap<>();
    public Cart userCart;

    public Inventory(Cart newCart){
        itemsList.put("Ketchup",new Items("Ketchup", 4.0, 50));
        itemsList.put("Mayo",new Items("Mayo", 3.70, 25));
        itemsList.put("Shirt",new Items("Shirt", 20.64, 100));
        itemsList.put("Pants",new Items("Pants", 59.99, 80));
        userCart = newCart;
    }

    public void addToCart(String nameOfItem){
        userCart.register(itemsList.get(nameOfItem));
    }

    public void removeFromCart(String nameOfItem){
        userCart.unregister(itemsList.get(nameOfItem));
    }

    public void displayItems(){
        System.out.println("The items available are: ");
        for(String k : itemsList.keySet()){
            itemsList.get(k).print();
        }
        System.out.println("--------Items Listed Above--------");

    }



}
