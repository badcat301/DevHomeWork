package task1.src;

import java.io.StringReader;
import java.util.Arrays;

/**
 * Created by Fylhtq on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) throws NullPointerException {
        AbstractFactory factory = new Sea();
         AbstractFactory factory1 = new Land();
SeaAnimal[] mas = factory.getSeaAnimal();
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i].speak());
        }
//sdsds
        LandAnimal[] mas2 = factory1.getLandAnimal();
        for (int j = 0; j <mas2.length ; j++) {
            System.out.println(mas2[j].speak());

        }
        }

    }

