import java.util.*;

public class NotificationFactory {
    public static List<Notification> sendNotification(List<String> Types){
        List<Notification> notifications = new ArrayList<>();
        for(String type:Types){
            if(type.equals("EMAIL")){
                notifications.add(new EmailNotification());
            } else if (type.equals("SMS")){
                notifications.add(new SMSNotification());
            }
            else
                throw new IllegalArgumentException("Invalid Type");
        }return notifications;

    }
}
