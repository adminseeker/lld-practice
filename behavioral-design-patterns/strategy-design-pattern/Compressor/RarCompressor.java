public class RarCompressor implements CompressorStrategy {
    
    @Override
    public void compress(String filename) {
        System.out.println(filename+" compressed via Rar Compressor");
    }
}
