public class MovieProxy implements Video{
    private String filename;
    private Video video;

    public MovieProxy(String filename) {
        System.out.println("Proxy object is created!");
        this.filename = filename;
    }


    @Override
    public void play() throws InterruptedException {
        if(video==null) {
            video = new Movies(filename);
        }
        video.play();
    }
}
