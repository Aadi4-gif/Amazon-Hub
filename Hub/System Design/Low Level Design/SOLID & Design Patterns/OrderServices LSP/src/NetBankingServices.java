public class NetBankingServices implements Payment{
    @Override
    public void pay() {
        System.out.println("Processed Net Banking Payment!");
    }

    @Override
    public void refund() {
        System.out.println("Processed Net Banking Refund!");
    }
}
