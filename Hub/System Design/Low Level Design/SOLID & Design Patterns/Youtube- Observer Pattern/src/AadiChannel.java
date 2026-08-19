import java.util.ArrayList;
import java.util.List;

public class AadiChannel {
    String title;
    String fileName;

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }

    List<Subscriber> subscriberList = new ArrayList<>();


    public void subscribe(Subscriber subscriber){
    subscriberList.add(subscriber);
}

public void notifySubscriber() {
    for(Subscriber subscriber: subscriberList){
        subscriber.update(this);
    }


}

public void uploadVideo(String title, String fileName){
        this.title = title;
        this.fileName = fileName;
    System.out.println("Video has been uploaded");
    notifySubscriber();
}


}
