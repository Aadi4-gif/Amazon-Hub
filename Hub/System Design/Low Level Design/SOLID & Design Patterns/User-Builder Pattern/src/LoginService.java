import java.sql.SQLOutput;

public class LoginService {
    void registerUser(){
        UserBuilder builder = new UserBuilder();
        builder .setName("Oddyseus")
                .setAge(45)
                .setEmail("oddyseus@gmail.com");
        User user = new User(builder);
        System.out.println("User Registered Successfully -> " + user);
    }
}
