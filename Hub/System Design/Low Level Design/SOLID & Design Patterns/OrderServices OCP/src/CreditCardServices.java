public class CreditCardServices implements PaymentService{
    @Override
    public void processPayments() {

        System.out.println("Processed Credit Card Payment!");
    }
}
