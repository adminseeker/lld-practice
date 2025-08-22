import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements ImageService {

    Map<String,Image> imagesCache;
    ImageService imageService;

    public ImageProxy(){
        imagesCache=new HashMap<>();
        imageService=new ImageServiceImpl();
    }

    @Override
    public Image fetchImage(String name) {
        Image image = imagesCache.get(name);
        if(image!=null){
            System.out.println("Fetched From Cache:");
            return image;
        } 
        image=imageService.fetchImage(name);
        imagesCache.put(name,image);
        return image;
    }
}
