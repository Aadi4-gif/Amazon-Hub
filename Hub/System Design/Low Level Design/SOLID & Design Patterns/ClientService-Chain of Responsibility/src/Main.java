public class Main {
    public static void main(String[] args){
Client client = new Client(new Chatbot(new CustomerExecutive(new TechTeam())));

client.raiseIssue(new Issue("Level1", "INITIATED!"));

        client.raiseIssue(new Issue("Level2", "INITIATED!"));

        client.raiseIssue(new Issue("Level3", "INITIATED!"));
    }
    
}