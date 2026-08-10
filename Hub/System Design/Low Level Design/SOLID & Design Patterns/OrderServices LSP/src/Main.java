import java.util.*;
public class Main {
    public static void main(String[] args){
        PaymentClient client=new PaymentClient();

        List<Payment> paymentList = List.of(new CreditCardServices(), new UPIServices());
        for(Payment payment: paymentList){
            client.processTransaction(payment);
        }

        List<NonRefundablePayments> nonRefundablePaymentsList = List.of(new CryptoServices());
        for(NonRefundablePayments payment: nonRefundablePaymentsList){
            client.processTransaction(payment);
        }
    }
}