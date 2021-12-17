package filehand;
//creating a file
import java.io.*;

public class Filehand {
    public static void main(String[] args) {
        File f=new File("text.txt");
        File f1=new File("Text1.txt");
        try {
            if(f.createNewFile())
                f.renameTo(f1);
        }
        catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
        if(f.exists())
        {
            System.out.println("file created Successfully");
            System.out.println("file name: "+f.getName());
            System.out.println("absolute path: "+f.getPath());
            System.out.println(f.exists());
            System.out.println("size: "+f.length());
        }

    }
}
