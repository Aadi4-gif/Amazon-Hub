public class UserMigrationService {
    public void migrateUser(){
        UserBuilder builder = new UserBuilder();
        builder .setAge(30)
                .setName("Rahul")
                .setEmail("rahul@gmail.com")
                .setCity("Mumbai");

        User user = new User(builder);
        System.out.println("User Migrated -> " + user);
    }
}
