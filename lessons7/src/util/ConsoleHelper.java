package util;

import java.util.Scanner;

/**
 * Created by Fylhtq on 04.05.2017.
 */
public class ConsoleHelper {
   static Scanner sc = new Scanner(System.in);

  public   static String getLine(String message){
        System.out.println(message);
        return sc.nextLine();
    }
}
