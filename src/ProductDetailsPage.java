public class ProductDetailsPage implements TerminalPage {
    private TerminalPage page;
    private String itemName;

    public ProductDetailsPage(TerminalPage page, String itemName) {
        this.page = page;
        this.itemName = itemName;
    }

    public ProductDetailsPage() {

    }

    @Override
    public void display() {
        page.display();

        // get the item details from the inventory
        Items item = Inventory.getInstance().getItemsList().get(itemName);

        // display the item details
        System.out.println("----- Product Details -----");
        System.out.println("Name: " + item.getName());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Quantity: " + item.getQuantity());
    }
}
