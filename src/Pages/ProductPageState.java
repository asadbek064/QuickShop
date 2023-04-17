package Pages;

public class ProductPageState  implements TerminalState {
    private final TerminalPage productPage = new ProductPage();

    @Override
    public void displayCurrentPage() {
        productPage.display();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("home")) {
            TerminalManager.setCurrentState(new HomePageState());
        } else if (input.equals("history")) {
            TerminalManager.setCurrentState(new OrderHistoryState());
        }
    }
}