
public class OTPServices {
    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
            Notification notification = factory.createNotification();
            notification.send();
    }
    public void formatTemplate(){
        NotificationFactory factory = new SMSFactory();
        Template template = factory.createTemplate();
        template.format();
    }
}