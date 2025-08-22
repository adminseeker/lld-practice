import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    
    private static Map<String,Shape> flyWeightCache=new HashMap<>();

    private ShapeFactory(){};

    public static Shape getShape(String type, String color){
        String state=type+"_"+color;
        Shape shape = flyWeightCache.get(state);
        if(shape!=null) return flyWeightCache.get(state);
        
        if(type.equals("circle")){
            shape=new Circle(color);
        }else if(type.equals("rectangle")){
            shape=new Rectangle(color);
        }else{
            throw new IllegalArgumentException("unsupported shape!");
        }
        flyWeightCache.put(state, shape);
        return shape;
    }
}
