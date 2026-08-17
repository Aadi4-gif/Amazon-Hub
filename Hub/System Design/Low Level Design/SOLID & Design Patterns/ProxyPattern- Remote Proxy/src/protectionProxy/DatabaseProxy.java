package protectionProxy;

public class DatabaseProxy implements Database{
    private Database db;
    private String role;

    public DatabaseProxy(String role) {
        this.role = role;
        this.db = new MySqlDatabase();
    }


    @Override
    public void delete(){
        if(role.equals("Admin")){
            db.delete();
        }else{
            System.out.println("Access Denied!");
        }

    }
}
