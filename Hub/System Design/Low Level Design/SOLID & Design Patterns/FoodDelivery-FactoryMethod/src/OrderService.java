
public class OrderService {
    public void sendNotification() {
       NotificationFactory factory = new EmailFactory();
       Notification notification = factory.createNotification();
       notification.send();
       NotificationFactory factory1 = new SMSFactory();
       Notification notification1 = factory1.createNotification();
       notification1.send();
    }
}

