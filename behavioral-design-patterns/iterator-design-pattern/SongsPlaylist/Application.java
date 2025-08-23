public class Application {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Song song1 = new Song("song1", "artist1");
        Song song2 = new Song("song2", "artist2");
        Song song3 = new Song("song3", "artist3");
        Song song4 = new Song("song4", "artist4");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        SongIterator iterator = playlist.forwardIterator();
        System.out.println("Using Forward Iterator: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }

        iterator = playlist.reverseIterator();
        System.out.println("Using Reverse Iterator: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
