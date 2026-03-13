public class ZipCompressor implements CompressorStrategy {
    
    @Override
    public void compress(String filename) {
        System.out.println(filename+" compressed via Zip Compressor");
    }
}
