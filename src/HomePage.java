
public class HomePage implements TerminalPage {
    String header = "Welcome to QuickShop\n";
    String navView = "Navigation:" + "\t"+
            "(1):Order History Page" + "\t"+ "(2):Search product + (3): Select Item ex:3 1 \n";

    // get global cart & inventory instance
    Cart myCart = Cart.getInstance();
    Inventory myInventory = Inventory.getInstance();
    @Override
    public  void display() {
        TerminalManager.clearScreen();


        System.out.println(header);

        myInventory.displayItems();

        System.out.println(navView);
    }
}
