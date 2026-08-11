public class SMSFactory implements NotificationFactory{
    public Notification createNotification(){
        return new SMSNotification();
    }
    public Template createTemplate(){
        return new SMSTemplate();
    }
}