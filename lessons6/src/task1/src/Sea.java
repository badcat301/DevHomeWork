package task1.src;

/**
 * Created by Fylhtq on 03.05.2017.
 */
public class Sea implements AbstractFactory {


    @Override
    public SeaAnimal getSeaAnimal() {
       return new Shark();
    }
}