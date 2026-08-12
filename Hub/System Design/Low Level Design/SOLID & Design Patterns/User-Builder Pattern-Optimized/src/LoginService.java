import java.sql.SQLOutput;

public class LoginService {
    void registerUser(){
        User user = new User.UserBuilder()
                .setName("Oddyseus")
                .setAge(45)
                .setEmail("oddyseus@gmail.com")
                .build();
        System.out.println("User Registered Successfully -> " + user);
    }
}
