
import java.io.*;

public class JavaRegex {

    public static void main(String[] args) {

        try
        {
            File file=new File("../input/input00.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);
            String ip;
            while((ip=br.readLine())!=null)
                System.out.println(ip.matches(new MyRegex().pattern));

            fr.close();    //closes the stream and release the resources
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}

