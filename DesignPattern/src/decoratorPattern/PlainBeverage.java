package decoratorPattern;

public class PlainBeverage implements Beverage{

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
