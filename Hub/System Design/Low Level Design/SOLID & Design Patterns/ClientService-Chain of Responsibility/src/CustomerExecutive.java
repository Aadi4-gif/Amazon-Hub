public class CustomerExecutive implements CustomerSupportHandler{
    private CustomerSupportHandler handler;


    public CustomerExecutive(CustomerSupportHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("Level2")){
//            CustomerExecutive Logic
            System.out.println("CustomerExecutive resolved the issue");
            issue.getStatus("Success");
        }else{
            System.out.println("CustomerExecutive could'nt resolve the issue." + "Moving to the next handler");
            issue.getStatus("Pending");
            handler.handleRequest(issue);
        }
    }
}
