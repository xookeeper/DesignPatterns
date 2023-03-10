package prototypePattern;

public abstract class Shape {

    protected int height;
    protected int width;

    public Shape(int height, int width){
        this.height = height;
        this.width = width;
    }

    public abstract void draw();

    public abstract Shape cloneObject();
}
