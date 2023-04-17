package Pages;

public class OrderHistoryState implements TerminalState {
    private final TerminalPage orderHistoryPage = new OrderHistoryPage();

    @Override
    public void displayCurrentPage() {
        orderHistoryPage.display();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("home")) {
            TerminalManager.setCurrentState(new HomePageState());
        }
    }
}
