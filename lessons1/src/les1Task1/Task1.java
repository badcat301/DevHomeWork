package les1Task1;

/**
 * Created by Fylhtq on 20.04.2017.
 */
public class Task1 {


        public static void main(String[] args) {

            if (args.length != 2) {
                System.out.println("Wrong Arguments");
                System.exit(0);
            }

            String text = args[0];
            int count = Integer.parseInt(args[1]);
            if  (count >5) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(text);

                }
                System.out.println("Arguments > 5");
            }

            if (count <= 5) {
                for (int i = 0; i < count; i++) {
                    System.out.println(text);
                }


                if (count < 1) {
                    System.out.println("Arguments < 1");
                }



            }

        }

    }




