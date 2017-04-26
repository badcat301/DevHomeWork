package les2Task1;

import java.util.Scanner;

/**
 * Created by Fylhtq on 20.04.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number 1 or 2");

        int num = s.nextInt();
        switch (num){
            case 1:
                System.out.println("Enter tree sides of the triagle");
                int a,b,c;

                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();

                double pp = (a+b+c)/2.0;
                double p = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));

                System.out.println("Area of a triagle = "+p);
                break;
            case 2:
                System.out.println("Enter two sides of the triagle ahd angle");
                int a1,b1,c1;

                a1 = s.nextInt();
                b1 = s.nextInt();
                c1 = s.nextInt();
                double p1 = a1*b1*Math.sin(c1*Math.PI/180)/2;
                System.out.println("Area of a triagle = "+p1);
                break;
        }
    }
}
