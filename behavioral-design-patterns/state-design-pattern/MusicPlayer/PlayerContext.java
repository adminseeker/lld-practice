public class PlayerContext {
    private State state;

    public PlayerContext(State currentState){
        this.state=currentState;
    }

    public void setState(State currentState){
        this.state=currentState;
    }

    public void play(){
       state.play(this);
    }

    public void pause(){
        state.pause(this);
    }

    public void stop(){
       state.stop(this);
    }
}
