package filehand;
import java.io.*;
//reading and writing on to the file
public class Filehand3 {
    public static void main(String[] args) {
        File f=new File("text.txt");
        try {
            //FileWriter fw = new FileWriter(f);
            //FileWriter fw=new File("text.txt");
            FileWriter fw=new FileWriter(f);
            fw.write("\n java is an easy language");
            fw.write("\n100");
            fw.write("\n10.5\n");
            char c[]={'J','A','V','A'};
            fw.write(c);
            fw.flush();
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
       try {
            FileReader fr = new FileReader("text.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch (FileNotFoundException fo)
        {
            System.out.println(fo.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
