abstract class PaymentProcessor {

    public final void processPayment() {
        validateCard();
        makePayment();
        sendReceipt();
    }

    private void validateCard() {
        System.out.println("Validating card...");
    }

    private void sendReceipt() {
        System.out.println("Sending receipt to customer...");
    }

    protected abstract void makePayment();
}
