package adapterPattern;

public class Car implements Vechiel{
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}
