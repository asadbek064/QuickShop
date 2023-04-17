public class CheckoutPageState implements TerminalState{
    private final TerminalPage checkoutPage = new CheckoutPage();
    @Override
    public void displayCurrentPage() {
        checkoutPage.display();
    }

    @Override
    public void handleInput(String input) {
        if (input.equals("1")) {
            // get user payment detail & address detail
        } else if (input.equals("2")) {
            // checkout user and show them a order confirm page
        } else if (input.equals("3")) {
            TerminalManager.setCurrentState(new HomePageState());
        }
    }
}
