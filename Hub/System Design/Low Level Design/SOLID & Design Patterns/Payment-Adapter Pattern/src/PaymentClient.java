// Client
public class PaymentClient {
    PaymentService payment;

    public PaymentClient(PaymentService payment) {
        this.payment = payment;
    }

    public void makePayment(){
        String result = payment.pay(100, 123);
        if(result.equals("success")){
            System.out.println("Payment done Successfully");
        }else{
            System.out.println("Payment Failed");
        }
    }
}
