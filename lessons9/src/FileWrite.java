import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Fylhtq on 15.05.2017.
 */
public class FileWrite {
    public static void write(String fileName, String text)
    {

        File file = new File(fileName);
        try {

            if(!file.exists()){
                file.createNewFile();
            }


            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {

                out.print(text);
            } finally {

                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }


    }
}


