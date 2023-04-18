import java.util.HashMap;
import java.util.Map;

//maintains a list of the websites inventory
public class Inventory{
    private static Inventory instance;
    private Map<String, Items> itemsList;

    protected Inventory() {
        itemsList = new HashMap<>();
        itemsList.put("Ketchup",new Items("Ketchup", 4.0, 50));
        itemsList.put("Mayo",new Items("Mayo", 3.70, 25));
        itemsList.put("Shirt",new Items("Shirt", 20.64, 100));
        itemsList.put("Pants",new Items("Pants", 59.99, 80));

    }


    public static synchronized Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public Map<String, Items> getItemsList() {
        return itemsList;
    }

    public void addProduct(String productName, Double price,int quantity) {
        if(itemsList.containsKey(productName)) {
            int currentQuantity = itemsList.get(productName).getQuantity();
            itemsList.get(productName).setQuantity(currentQuantity + quantity);
        }
        else
            itemsList.put(productName,new Items(productName,price,quantity));
    }

    public void removeProduct(String productName) {
        if (!itemsList.containsKey(productName)) {
            throw new IllegalArgumentException("Product " + productName + "' does not exist.");
        }
        itemsList.remove(productName);
    }

    public void displayItems(){
        System.out.println("The items available are: ");
        for(String k : itemsList.keySet()){
            itemsList.get(k).print();
        }
        System.out.println("--------Items Listed Above--------");

    }
}
