package filehand;
import java.io.*;
import java.util.*;

public class Filehand6 {
    public static void main(String[] args) {

        try
        {
            PrintWriter pr=new PrintWriter("Text1.txt");
            pr.write("Hello java\n");
            pr.write(100);
            pr.println();
            char c[]={'j','a','v','a'};
            pr.write(c);
            pr.println();
            pr.println(100);
            pr.flush();
            pr.close();
            File f=new File("Text1.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }

        catch(IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
