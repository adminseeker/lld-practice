public interface State {
    public void play(PlayerContext context);
    public void pause(PlayerContext context);
    public void stop(PlayerContext context);
}
