public class SevenZipCompressor implements CompressorStrategy {
    
    @Override
    public void compress(String filename) {
        System.out.println(filename+" compressed via 7z Compressor");
    }
}
