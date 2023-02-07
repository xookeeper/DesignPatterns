import factorypattern.Animal;
import factorypattern.AnimalFactory;
import factorypattern.AnimalType;

public class Main {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);

        animal.eat();
    }
}