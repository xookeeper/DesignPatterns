package decoratorPattern;

public class Coffee extends BeverageDecorator{
    @Override
    public int getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "coffee";
    }

    public Coffee(Beverage beverage) {
        super(beverage);
    }
}
