public class EmailService {
    public void sendWelcomeEmail(){
        UserBuilder builder = new UserBuilder();
        builder .setName("Achilles")
                .setAge(25)
                .setEmail("achilles@gmail.com");
        User user = new User(builder);
        System.out.println("Welcome Email sent to ->" + user);
    }
}
