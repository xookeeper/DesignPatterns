package prototypePattern;

public class Square extends Shape{

    public Square(int height, int width){
        super(height, width);
    }
    @Override
    public void draw() {
        System.out.println("draw square : height" + height + " width : " + width );
    }

    @Override
    public Shape cloneObject() {
        return new Square(height, width);
    }
}
