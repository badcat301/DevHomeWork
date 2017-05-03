package task1.src;

/**
 * Created by Fylhtq on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new Sea();
        factory.getSeaAnimal();
    }
}
