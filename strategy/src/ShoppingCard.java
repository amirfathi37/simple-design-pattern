public class ShoppingCard {
    DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void calculateDiscount(Integer totalPrice) {
        discountStrategy.applyDiscount(totalPrice);
    }
}
