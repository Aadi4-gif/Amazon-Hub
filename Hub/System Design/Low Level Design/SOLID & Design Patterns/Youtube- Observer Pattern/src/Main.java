public class Main {
    public static void main(String[] args){
YoutubeSubscriber Subscriber1 = new YoutubeSubscriber("Aadi", 10001);
        YoutubeSubscriber Subscriber2 = new YoutubeSubscriber("Tony", 10002);
        YoutubeSubscriber Subscriber3 = new YoutubeSubscriber("Angela", 10003);
        YoutubeSubscriber Subscriber4 = new YoutubeSubscriber("Cristiano", 10004);

        AadiChannel aadiChannel = new AadiChannel();
aadiChannel.subscribe(Subscriber1);
aadiChannel.subscribe(Subscriber2);
aadiChannel.subscribe(Subscriber3);
aadiChannel.subscribe(Subscriber4);

aadiChannel.uploadVideo("Observer Pattern", "Observer.mp4");
    }
    
}