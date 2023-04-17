
public class HomePage implements TerminalPage {
    String header = "Welcome to QuickShop\n";
    String navView = "Navigation:" + "\t"+
            "(1):Order History Page" + "\t"+ "(2):Search product + (3): Select Item ex:3 1 \n";

    @Override
    public  void display() {
        TerminalManager.clearScreen();
        System.out.println(
                header + navView
        );
    }
}
