public class VlcPlayer implements AdvancedAudioPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing via VlcPlayer: "+fileName);
    }
}
