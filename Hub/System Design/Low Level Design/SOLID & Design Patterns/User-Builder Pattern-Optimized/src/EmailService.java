public class EmailService {
    public void sendWelcomeEmail(){
        User user = new User.UserBuilder()
                .setName("Achilles")
                .setAge(25)
                .setEmail("achilles@gmail.com")
                .build();
        System.out.println("Welcome Email sent to ->" + user);
    }
}
