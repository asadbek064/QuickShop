import java.math.BigDecimal;
import java.math.MathContext;

public class DiscountDecorator extends ProductDetailsPage {

    private final ProductDetailsPage page;
    private final double discount;

    public DiscountDecorator(ProductDetailsPage page, double discount) {
        this.page = page;
        this.discount = discount;
    }

    @Override
    public void display() {
        page.display();
        double price = getPrice() * (1 - discount);
        BigDecimal accuratePrice = new BigDecimal(price).round(new MathContext(3));
        System.out.println("Discounted price: $" + accuratePrice);
    }

    private double getPrice() {
        return  1;
    }
}
