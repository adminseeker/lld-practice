import java.util.NoSuchElementException;

public class ReverseIterator implements SongIterator{
    private Playlist playlist;
    private int index;

    public ReverseIterator(Playlist playlist){
        this.playlist=playlist;
        this.index=playlist.size()-1;
    }

    @Override
    public boolean hasNext() {
        return index>=0;
    }

    @Override
    public Song next() {
        if(hasNext()){
            return playlist.getSong(index--);
        }
        throw new NoSuchElementException("End of playlist!");
    }
}
