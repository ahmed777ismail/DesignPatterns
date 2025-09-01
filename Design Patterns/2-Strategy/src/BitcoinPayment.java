public class BitcoinPayment implements PaymentStrategy{
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}
