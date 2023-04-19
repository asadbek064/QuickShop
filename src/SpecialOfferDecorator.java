public class SpecialOfferDecorator extends ProductDetailsPage {

    private final ProductDetailsPage page;
    private final String specialOffer;

    public SpecialOfferDecorator(ProductDetailsPage page, String specialOffer) {
        this.page = page;
        this.specialOffer = specialOffer;
    }

    @Override
    public void display() {
        page.display();
        System.out.println("Special Offer: " + specialOffer);
    }
}
