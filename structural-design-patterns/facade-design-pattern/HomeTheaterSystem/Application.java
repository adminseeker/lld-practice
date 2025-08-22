public class Application {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheater();
        
        System.out.println("Movie Started!");
        homeTheater.watchMovie();
        System.out.println("Movie Completed!");
        homeTheater.endMovie();
    }
}
