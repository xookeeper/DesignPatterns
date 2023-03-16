package flyweightPattern;


import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String, Shape> shapeMap;

    public ShapeFactory() {
        this.shapeMap = new HashMap<>();
    }

    public Shape getShape(String color){
        if(shapeMap.containsKey(color)){
            return shapeMap.get(color);
        }

        System.out.println("Drawing a new square..");

        Shape shape = new Squrare(color);

        shapeMap.put(color, shape);

        return shape;

    }
}
