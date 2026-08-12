public class User {
    private String name;
    private int age;
    private String email;
    private String city;

public User(UserBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.email = builder.email;
    this.city = builder.city;
}

@Override
public String toString() {
    return "User(" + "name ='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", city='" + city + '\'' +  '}';
}
}
