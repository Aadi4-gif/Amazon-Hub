public class Movies implements Video{
    private String filename;

    public Movies(String filename) throws InterruptedException {
        this.filename = filename;
        loadVideo();
    }
// Heavy Operation
    public void loadVideo() throws InterruptedException {
        System.out.println("Loading video from server...");
        Thread.sleep(4000);
    }

    @Override
    public void play() {
        System.out.println("Movie is playing..." + filename);
    }
}
