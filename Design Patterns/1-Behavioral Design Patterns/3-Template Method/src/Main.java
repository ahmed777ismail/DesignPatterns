public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new CreditCardPayment();
        payment1.processPayment();

        System.out.println("-----");

        PaymentProcessor payment2 = new PayPalPayment();
        payment2.processPayment();
    }
}