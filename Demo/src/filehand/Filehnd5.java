package filehand;
//bytestream files copying images
import java.io.*;
public class Filehnd5 {
    public static void main(String[] args) {
        try {
            FileInputStream fr = new FileInputStream("Capture.PNG");
            FileOutputStream fo=new FileOutputStream("cap.PNG");
            int i;
            while((i=fr.read())!=-1)
            {
                fo.write(i);
            }
            fo.flush();
        }
        catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
    }
}
