public class PayPalPayment extends PaymentProcessor{
    @Override
    protected void makePayment() {
        System.out.println("Processing payment with PayPal.");
    }
}
