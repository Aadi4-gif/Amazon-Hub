public class UPIServices implements Payment{
    @Override
    public void pay(Double amount) {
        System.out.println("Processed UPI Payment!");
    }
    public void checkBalance(){
        System.out.println("Checking Balance...");
    }
}
