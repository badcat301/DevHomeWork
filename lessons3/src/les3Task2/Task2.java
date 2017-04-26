package les3Task2;

/**
 * Created by Fylhtq on 20.04.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 30;
        int b = a;
        a++;
        Integer c = 6;
        Integer d = c++;
        d--;
        String s = "string";
        s.replace('s', '#');
        s.toUpperCase();
        System.out.println("a = " + a); // a = ...
        System.out.println("b = " + b); // b = ...
        System.out.println("c = " + c); // c = ... почему то исходное значение меняется когда заново инициализируешь
        System.out.println("d = " + d); // d = ...
        System.out.println("s = " + s); // s = ..//должен поменять символ и вывести с большой буквы но т.к. символ решетка
        // наверно из за этого не меняет
    }

}
