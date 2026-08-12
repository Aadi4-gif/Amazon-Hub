import java.util.*;
public class Main {
    public static void main(String[] args){
        new OrderService().formatTemplate();
        new OrderService().sendNotification();
        new OTPServices().formatTemplate();
        new OTPServices().sendNotification();
    }

}
