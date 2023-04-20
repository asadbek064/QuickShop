/*
public class ProductFactory {
    public static Product createProduct(String productName) {
        if (productName.equalsIgnoreCase("quit")) {
            return null;
        }
        try {
            switch (productName.toLowerCase()) {
                case "product1":
                    return new Product1();
                case "product2":
                    return new Product2();
                case "product3":
                    return new Product3();
                default:
                    throw new IllegalArgumentException("Invalid product name: " + productName + "\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}*/
