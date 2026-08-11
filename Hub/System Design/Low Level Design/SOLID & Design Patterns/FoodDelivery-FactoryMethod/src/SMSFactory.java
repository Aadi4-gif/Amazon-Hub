public class SMSFactory implements NotificationFactory{
    public Notification createNotification(){
        return new SMSNotification();
    }
}
