public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(new WindowsRenderer());
        Shape rectangle = new Rectangle(new MacRenderer());

        circle.draw();
        rectangle.draw();
    }
}
