
public class OrderService {
    public void sendNotification() {
       NotificationFactory factory = new EmailFactory();
       Notification notification = factory.createNotification();
       notification.send();
       NotificationFactory factory1 = new SMSFactory();
       Notification notification1 = factory1.createNotification();
       notification1.send();
    }
    public void formatTemplate(){
        NotificationFactory factory = new EmailFactory();
        Template template = factory.createTemplate();
        template.format();
        NotificationFactory factory1 = new SMSFactory();
        Template template1 = factory1.createTemplate();
        template1.format();
    }
}

