public class Circle implements Shape{
    private String color;

    public Circle(String color){
        this.color=color;
    }

    @Override
    public void draw(int x, int y, int size) {
        System.out.println("Drawing "+color+" Circle: (x,y,size): "+"("+x+","+y+","+size+")");
    }
}
