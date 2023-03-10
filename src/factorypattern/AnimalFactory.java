package factorypattern;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType type){
        if(AnimalType.CAT.equals(type)){
            return new Cat();
        }else if(AnimalType.DOG.equals(type)){
            return new Dog();
        }

        return null;
    }
}
