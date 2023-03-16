package adapterPattern;

public class BicycleAdaper implements Vechiel{

    Bicycle bicycle;

    public BicycleAdaper(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void move() {

    }

    @Override
    public void accelerate() {
        bicycle.paddeling();
    }
}
