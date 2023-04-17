package Pages;

public class HomePageState implements TerminalState {
    private final TerminalPage homePage = new HomePage();

    @Override
    public void displayCurrentPage() {
        homePage.display();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("product")) {
            TerminalManager.setCurrentState(new ProductPageState());
        } else if (input.equals("history")) {
            TerminalManager.setCurrentState(new OrderHistoryState());
        }
    }
}
