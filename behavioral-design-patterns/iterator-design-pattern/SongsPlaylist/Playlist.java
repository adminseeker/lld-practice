import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    
    public Playlist(){
        songs=new ArrayList<>();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    public Song getSong(int index){
        return songs.get(index);
    }

    public int size(){
        return songs.size();
    }

    public SongIterator forwardIterator(){
        return new ForwardIterator(this);
    }

    public SongIterator reverseIterator(){
        return new ReverseIterator(this);
    }
}
