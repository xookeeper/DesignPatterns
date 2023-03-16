package flyweightPattern;

public class Squrare implements Shape{

    int x;
    int y;
    String color;

    public Squrare(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle : x = " + x + " y = " + y + " color = " + color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
