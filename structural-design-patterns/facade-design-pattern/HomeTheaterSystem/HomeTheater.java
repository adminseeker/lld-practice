public class HomeTheater implements HomeTheaterFacade {

    private Projector projector;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheater(){
        projector=new Projector();
        dvdPlayer=new DVDPlayer();
        soundSystem=new SoundSystem();
        lights=new Lights();
    }

    @Override
    public void watchMovie() {
        projector.on();
        dvdPlayer.play();
        lights.dim();
        soundSystem.on();
    }
    @Override
    public void endMovie() {
        dvdPlayer.stop();
        projector.off();
        soundSystem.off();
        lights.on(); 
    }
}
