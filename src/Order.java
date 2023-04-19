import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private double totalCost;

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        calculateTotalCost();
    }

    private void calculateTotalCost() {
        totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void displayOrder() {
        System.out.println("ORDER " + orderId + ":");
        for (Product product : products) {
            System.out.println(product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total Cost: $" + getTotalCost());
    }
}