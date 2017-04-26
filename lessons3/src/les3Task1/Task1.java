package les3Task1;

import java.util.Scanner;

/**
 * Created by Fylhtq on 20.04.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите любое предложение через пробел");
        Scanner scanner = new Scanner(System.in);//ВВодим  строки.
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        // разбиваем строки  на массив из слов.

        printSplittedElements(split);

        System.out.println("Введите слово для поиска из предложения");
        String s1 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        //проходимся по массиву

        for (int j = 0; j < split.length; j++) {
            if (split[j].equals(s1)) {
                stringBuilder.append("Слово найдено: " + s1 + " Индекс: " + "[" + j + "]");
            }
        }

        if(stringBuilder.toString().equals("")){
            System.out.println("Nothing");
        }else {
            System.out.println(stringBuilder);
        }

    }

    private static void printSplittedElements(String[] split) {
        for (int i = 0; i < split.length; i++) {
            System.out.println("Строка " + i + ": " + split[i]);
        }
    }
}






