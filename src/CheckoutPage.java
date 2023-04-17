
public class CheckoutPage implements TerminalPage {
    String header = "Checkout Page\n";
    String navView = "Navigation:" + "\t"+
            "(1):Add payment" + "\t"+ "(2) Checkout cart"+"\t"+"(3) Home Page";

    @Override
    public  void display() {
        TerminalManager.clearScreen();
        System.out.println(
                header + navView
        );
    }
}
