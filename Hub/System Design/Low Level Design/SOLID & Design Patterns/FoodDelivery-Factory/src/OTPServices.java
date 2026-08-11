import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OTPServices {
    public void sendNotification() {
        List<Notification> notifications = NotificationFactory.sendNotification(new ArrayList<>(Arrays.asList("SMS")));
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}