public class CreditCardServices implements Payment{
    @Override
    public void pay(Double amount) {
        if(amount>100000){
            throw new UnsupportedOperationException("Amount Limit Exceeded! ");
        }
        System.out.println("Processed Credit Card Payment!");
    }
}
