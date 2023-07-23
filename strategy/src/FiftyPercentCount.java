public class FiftyPercentCount implements DiscountStrategy{
    @Override
    public void applyDiscount(Integer totalPrice) {
        System.out.println(totalPrice + " - 50%");
}}
