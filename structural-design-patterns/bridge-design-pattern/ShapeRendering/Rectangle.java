public class Rectangle extends Shape{
    public Rectangle(Renderer renderer){
        super(renderer);
    }
    @Override
    public void draw() {
        System.out.println("drawing rectangle...");
        renderer.render();
    }
}
