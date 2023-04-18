public class Main {
    // Make the cart globaly accessible so any page can use the cart features

    public static void main(String[] args) {
        // Cart test
        /*Inventory inventory = new Inventory();
        Cart myCart = new Cart(inventory);
        inventory.displayItems();
        myCart.addToCart("Ketchup");
        myCart.addToCart("Mayo");
        myCart.addToCart("Pants");
        myCart.removeFromCart("Mayo");
        myCart.checkout();*/


        TerminalManager.run();

    }
}