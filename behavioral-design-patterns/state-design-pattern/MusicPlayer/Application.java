public class Application {
    public static void main(String[] args) {
        PlayerContext player = new PlayerContext(new StopState());

        player.play();
        player.pause();
        player.pause();
        player.stop();
        player.play();
        player.play();
        player.stop();
        player.play();
    }
}
