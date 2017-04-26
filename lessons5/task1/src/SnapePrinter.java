/**
 * Created by Fylhtq on 25.04.2017.
 */
public class SnapePrinter  {

    public void print(Snape snape) {

        snape.draw();
    }


    public static void main(String[] args) {
        Snape  snape = new Snape();
        Snape  snape1 = new Circle();
        Snape snape2 = new Sqare();
        Snape snape3 = new Triangle();
        SnapePrinter s = new SnapePrinter();

        s.print(snape);
        s.print(snape1);
        s.print(snape2);
        s.print(snape3);

        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
    }



}

