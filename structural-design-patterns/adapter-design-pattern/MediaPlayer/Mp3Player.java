public class Mp3Player implements AudioPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing via Mp3Player: "+fileName);
    }
}
