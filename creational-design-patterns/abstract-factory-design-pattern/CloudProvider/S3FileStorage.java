public class S3FileStorage implements FileStorage {
    @Override
    public void upload(String filename){
        System.out.println(filename +" uploaded to AWS S3 File Storage.");
    }

    @Override
    public void download(String filename){
        System.out.println(filename +" downloaded from AWS S3 File Storage.");
    }
}
