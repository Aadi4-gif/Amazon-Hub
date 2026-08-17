public class Main {
    public static void main(String[] args){
        new PaymentClient(new GpayAdapter(new GpayGateway())).makePayment();
        new PaymentClient(new PaypalAdapter(new PaypalGateway())).makePayment();
    }
    
}