public class Product3 implements Product {
    private final String name = "Product3";
    private final String description = "This is Product 3.";
    private final double price = 20.99;

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