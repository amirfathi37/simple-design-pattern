public class Main {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.setDiscountStrategy(new TenPercentCount());
        shoppingCard.calculateDiscount(100);
        shoppingCard.setDiscountStrategy(new FiftyPercentCount());
        shoppingCard.calculateDiscount(200);
    }
}