public class FileCompressor {
   private CompressorStrategy compressor;

    public void setCompressor(CompressorStrategy compressor){
        this.compressor=compressor;
    }

    public void compressFile(String filename){
        if(compressor==null) throw new IllegalArgumentException("compressor strategy is null!");
        compressor.compress(filename);
    }
}
