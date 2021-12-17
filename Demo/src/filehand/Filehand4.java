package filehand;
import java.io.*;
//reading from the file
public class Filehand4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("text.txt");
            FileWriter fw=new FileWriter("Text1.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                fw.write(i);
                System.out.print((char)i);
            }
            fw.flush();
        }
        catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
    }
}
