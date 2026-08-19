public class YoutubeSubscriber implements Subscriber{
    String name;
    int id;

    public YoutubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void update(AadiChannel channel){
        System.out.println("Uploaded Youtube Video:" + " Title:" + channel.getTitle() + " Type:" + channel.getFileName() + " sent Notification to" + " Name:" + name + " ID:" + id);
    }
}
