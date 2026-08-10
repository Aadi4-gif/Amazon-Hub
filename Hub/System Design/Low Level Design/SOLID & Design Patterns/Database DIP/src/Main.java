public class Main {
    public static void main(String[] args){
        UserService user1 = new UserService(new MongoDBDatabase());
        user1.saveUser("Krithn");

        UserService user2 = new UserService(new MySQLDatabase());
        user2.saveUser("Aadi");
    }
}
