public class UserMigrationService {
    public void migrateUser(){
        User user = new User.UserBuilder()
                .setAge(30)
                .setName("Rahul")
                .setEmail("rahul@gmail.com")
                .setCity("Mumbai")
                .build();



        System.out.println("User Migrated -> " + user);
    }
}
