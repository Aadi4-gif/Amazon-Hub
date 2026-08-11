public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    public Template createTemplate(){
        return new EmailTemplate();
    }
}