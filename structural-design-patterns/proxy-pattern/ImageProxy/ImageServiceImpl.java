public class ImageServiceImpl implements ImageService {
    @Override
    public Image fetchImage(String name) {
        try {
            System.out.println("Fetching image from the server...");
            Thread.sleep(2000);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Image(name);
    }    
}
