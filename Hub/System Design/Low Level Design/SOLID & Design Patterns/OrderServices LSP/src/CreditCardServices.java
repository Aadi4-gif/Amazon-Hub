public class CreditCardServices implements Payment{
    @Override
    public void pay() {
        System.out.println("Credit Card Payment Processed!");
    }

    @Override
    public void refund() {
        System.out.println("Credit Card Refund Processed!");
    }
}
