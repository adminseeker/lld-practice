public class Rectangle implements Shape{
    private String color;

    public Rectangle(String color){
        this.color=color;
    }

    @Override
    public void draw(int x, int y, int size) {
        System.out.println("Drawing "+color+" Rectangle: (x,y,size): "+"("+x+","+y+","+size+")");
    }
}
