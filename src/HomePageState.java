public class HomePageState implements TerminalState {
    private final TerminalPage homePage = new HomePage();
    Inventory currentInventory;
    Cart myCart = new Cart(currentInventory);
    public void setInventory(Inventory inventory) {
        this.currentInventory = inventory;
    }
    @Override
    public void displayCurrentPage() {
        homePage.display();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("product")) {
            TerminalManager.setCurrentState(new ProductPageState());
        } else if (input.equals("1")) {
            TerminalManager.setCurrentState(new OrderHistoryState());
        } else if (input.contains("3")) {
            // extract product name
            String selectedItem = input.split("3 ")[1];

            // add to cart
        }
    }
}
