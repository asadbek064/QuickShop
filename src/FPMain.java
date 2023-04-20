import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = "";
        while (!productName.equalsIgnoreCase("quit")) {
            System.out.print("Enter product name (or type 'quit' to exit): ");
            productName = scanner.nextLine();

            Product product = ProductFactory.createProduct(productName);
            if (product != null) {
                System.out.println("Name: " + product.getName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Price: $" + product.getPrice() + "\n");
            }
        }

        scanner.close();
    }
}