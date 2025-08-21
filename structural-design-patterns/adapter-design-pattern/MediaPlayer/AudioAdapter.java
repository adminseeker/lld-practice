public class AudioAdapter implements AudioPlayer {

    private AdvancedAudioPlayer advancedMediaPlayer;

    @Override
    public void play(String fileName) {
        if(fileName.endsWith(".mp4")){
            advancedMediaPlayer=new Mp4Player();
        }else if(fileName.endsWith(".vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }else{
            throw new IllegalArgumentException("Unsupported Media Type");
        }
        advancedMediaPlayer.play(fileName);    
    }
}
