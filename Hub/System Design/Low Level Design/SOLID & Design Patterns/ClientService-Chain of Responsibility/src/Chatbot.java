public class Chatbot implements CustomerSupportHandler{
    private CustomerSupportHandler handler;

    public Chatbot(CustomerSupportHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("Level1")){
//            Chatbot Logic
            System.out.println("Chatbot resolved the issue");
            issue.getStatus("Success");
        }else{
            System.out.println("Chatbot could'nt resolve the issue." + "Moving to the next handler");
            issue.getStatus("Pending");
            handler.handleRequest(issue);
        }

    }
}
