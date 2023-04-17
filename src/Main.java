import Pages.TerminalManager;

public class Main {
    public static void main(String[] args) {

        // Cart Test
       /* Cart myCart = new Cart();
        Inventory inventory = new Inventory(myCart);
        inventory.displayItems();
        inventory.addToCart("Ketchup");
        inventory.addToCart("Ketchup");
        inventory.addToCart("Ketchup");
        inventory.addToCart("Mayo");
        inventory.addToCart("Pants");
        inventory.removeFromCart("Mayo");
        myCart.checkout();*/

        TerminalManager.run();

    }
}