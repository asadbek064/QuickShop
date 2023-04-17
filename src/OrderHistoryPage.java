public class OrderHistoryPage implements TerminalPage {
    String header = "Order History Page\n";
    String navView = "Navigation:" + "\t"+
            "(1):Home page" + "\t"+ "(2): Select Item ex:3 1 \n";

    @Override
    public  void display() {
        TerminalManager.clearScreen();
        System.out.println(
                header + navView
        );
    }
}
