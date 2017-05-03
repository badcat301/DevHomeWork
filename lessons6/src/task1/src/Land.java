package task1.src;

/**
 * Created by Fylhtq on 03.05.2017.
 */
public class Land implements AbstractFactory {
    @Override
    public SeaAnimal[] getSeaAnimal() {
        return null;
    }

    @Override
    public LandAnimal[] getLandAnimal() {
        LandAnimal [] landAnimals = {new Cat(),new Dog(),new Lion()};
        return landAnimals;
    }
}
