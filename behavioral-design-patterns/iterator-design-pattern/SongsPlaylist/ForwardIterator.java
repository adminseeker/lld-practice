import java.util.NoSuchElementException;

public class ForwardIterator implements SongIterator{
    private Playlist playlist;
    private int index;

    public ForwardIterator(Playlist playlist){
        this.playlist=playlist;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<playlist.size();
    }

    @Override
    public Song next() {
        if(hasNext()){
            return playlist.getSong(index++);
        }
        throw new NoSuchElementException("End of playlist!");
    }
}
