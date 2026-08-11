
public class OTPServices {
    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
            Notification notification = factory.createNotification();
            notification.send();
    }
}