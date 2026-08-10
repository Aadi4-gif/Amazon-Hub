public class UPIServices implements Payment{
    @Override
    public void pay() {
        System.out.println("Processed UPI Payment!");
    }

    @Override
    public void refund() {
        System.out.println("Processed UPI Refund!");
    }

    public void checkBalance(){
        System.out.println("Checking UPI Balance...");
    }
}
