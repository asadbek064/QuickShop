public class Product2 implements Product {
    private final String name = "Product2";
    private final String description = "This is Product 2.";
    private final double price = 15.99;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}