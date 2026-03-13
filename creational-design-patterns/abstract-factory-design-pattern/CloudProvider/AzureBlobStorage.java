public class AzureBlobStorage implements FileStorage {
    @Override
    public void upload(String filename){
        System.out.println(filename +" uploaded to Azure Blob File Storage.");
    }

    @Override
    public void download(String filename){
        System.out.println(filename +" downloaded from Azure Blob File Storage.");
    }
}
