public class CryptoServices implements  NonRefundablePayments{

    @Override
    public void pay() {
        System.out.println("Crypto Payment Processed!");
    }
}
