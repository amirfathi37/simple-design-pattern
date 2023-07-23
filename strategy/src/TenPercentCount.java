public class TenPercentCount implements DiscountStrategy{
    @Override
    public void applyDiscount(Integer totalPrice) {
        System.out.println(totalPrice + " - 10%");
    }
}
