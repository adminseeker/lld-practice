public class PlayState implements State{
    @Override
    public void play(PlayerContext context) {
        System.out.println("Play: Music is already playing...");
    }
    @Override
    public void pause(PlayerContext context) {
        System.out.println("Pause: Music Paused...");
        context.setState(new PauseState());
    }
    @Override
    public void stop(PlayerContext context) {
        System.out.println("Stop: Music Stopped...");
        context.setState(new StopState());
    }
}
