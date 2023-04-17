
public class Main {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();
        Cart myCart = new Cart(inventory);
        inventory.displayItems();
        myCart.addToCart("Ketchup");
        myCart.addToCart("Ketchup");
        myCart.addToCart("Ketchup");
        myCart.addToCart("Mayo");
        myCart.addToCart("Pants");
        myCart.removeFromCart("Mayo");
        myCart.checkout();
        //demonstrates one instance of inventory being shared with all users
        Cart user2Cart = new Cart(inventory);
        user2Cart.addToCart("Ketchup");
        user2Cart.checkout();

    }
}