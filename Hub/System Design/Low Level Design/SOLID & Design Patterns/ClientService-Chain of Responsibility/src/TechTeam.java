public class TechTeam implements CustomerSupportHandler{
    private CustomerSupportHandler handler;

    public TechTeam() {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("Level3")){
//            TechTeam Logic
            System.out.println("TechTeam resolved the issue");
            issue.getStatus("Success");
        }else{
            System.out.println("Issue not Solved!");
            issue.getStatus("Failed");
            handler.handleRequest(issue);
        }
    }
}
