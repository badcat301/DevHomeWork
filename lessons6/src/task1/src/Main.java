package task1.src;

import java.io.StringReader;
import java.util.Arrays;

/**
 * Created by Fylhtq on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new Sea();

SeaAnimal[] mas = factory.getSeaAnimal();
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i].speak());
        }
        }

    }

