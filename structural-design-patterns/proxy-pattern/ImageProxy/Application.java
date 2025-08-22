public class Application {
    public static void main(String[] args) {
        ImageProxy imageService = new ImageProxy();

        System.out.println(imageService.fetchImage("image1.png"));
        System.out.println(imageService.fetchImage("image1.png"));
        System.out.println(imageService.fetchImage("image2.png"));
    }
}
