public class Application {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new Mp3Player();
        audioPlayer.play("music1.mp3");

        AudioPlayer audioAdapter = new AudioAdapter();
        audioAdapter.play("music2.mp4");
        audioAdapter.play("music3.vlc");
    }
}
