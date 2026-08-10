public class PaymentClient {
    public void processTransaction(Payment payment){
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayments payment){
        payment.pay();
    }
    }
