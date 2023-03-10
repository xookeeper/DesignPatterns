import builderPattern.Person;
import decoratorPattern.Beverage;
import decoratorPattern.Coffee;
import decoratorPattern.PlainBeverage;
import factorypattern.Animal;
import factorypattern.AnimalFactory;
import factorypattern.AnimalType;
import observerPattern.Observer;
import observerPattern.Subject;
import observerPattern.WeatherObserver;
import observerPattern.WeatherStation;
import prototypePattern.Shape;
import prototypePattern.Square;
import strategyPattern.Multiplication;
import strategyPattern.OperationManager;

public class Main {
    public static void main(String[] args) {


        // factory design pattern
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();

        // Decorator design pattern
        Beverage beverage = new Coffee(new PlainBeverage());
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());


        // Builder pattern
        Person person = new Person.Builder("pk", "pk@pk.com").setAddress("xyz").build();

        // Strategy pattern
        OperationManager op = new OperationManager();
        op.setStrategy(new Multiplication());
        op.execute(4, 8);


        // Observer pattern
        WeatherStation station = new WeatherStation();
        Observer observer = new WeatherObserver(station);
        station.setTemperature(100);

        // Prototype design patterns
        Shape square = new Square(10, 10);
        square.draw();
        Shape clonedObject = square.cloneObject();
        clonedObject.draw();


    }
}