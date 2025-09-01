public class CreditCardPayment extends PaymentProcessor{

    @Override
    protected void makePayment() {
        System.out.println("Processing payment with Credit Card.");
    }
}
