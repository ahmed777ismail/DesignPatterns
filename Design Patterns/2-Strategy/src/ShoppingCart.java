public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Inject Strategy
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
