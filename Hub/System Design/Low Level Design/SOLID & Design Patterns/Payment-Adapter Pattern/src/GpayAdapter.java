public class GpayAdapter implements PaymentService{
    GpayGateway gpayGateway;

    public GpayAdapter(GpayGateway gpayGateway) {
        this.gpayGateway = gpayGateway;
    }

    @Override
    public String pay(int amount, int customerId) {
        boolean result = gpayGateway.performTransaction(Double.valueOf(amount), customerId);
        if(result==true){
            return "success";
        }
        return "failed";
        }
    }

