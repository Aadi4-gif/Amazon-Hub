public class Main {
    public static void main(String[] args) throws InterruptedException {
        Video video1 = new MovieProxy("Fight Club.mp4");
        Video video2 = new MovieProxy("Obsession.mp4");
        Video video3 = new MovieProxy("MSDhoni.mp4");

        video1.play();
        video2.play();
        video3.play();



        video1.play();
        video2.play();
        video3.play();
    }
    
}