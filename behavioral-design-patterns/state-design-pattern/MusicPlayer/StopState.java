public class StopState implements State {
    @Override
    public void play(PlayerContext context) {
        System.out.println("Play: Music is playing...");
        context.setState(new PlayState());
    }
    @Override
    public void pause(PlayerContext context) {
        System.out.println("Pause: No Music Playing...");
    }
    @Override
    public void stop(PlayerContext context) {
        System.out.println("Stop: No Music Playing...");
    }
}
