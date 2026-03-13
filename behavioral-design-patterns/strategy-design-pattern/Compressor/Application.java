
public class Application {
    public static void main(String[] args) {
        FileCompressor fileCompressor = new FileCompressor();
        fileCompressor.setCompressor(new ZipCompressor());
        fileCompressor.compressFile("test.mp4");

        fileCompressor.setCompressor(new RarCompressor());
        fileCompressor.compressFile("test.mp4");

        fileCompressor.setCompressor(new SevenZipCompressor());
        fileCompressor.compressFile("test.mp4");
    }
}
