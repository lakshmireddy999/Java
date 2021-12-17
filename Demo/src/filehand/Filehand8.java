package filehand;

import java.io.*;

public class Filehand8 {
    public static void main(String[] args) {
        try {
            Employee e=null;
            FileInputStream fi = new FileInputStream("Employee.txt");
            ObjectInputStream oi=new ObjectInputStream(fi);
            e=(Employee) oi.readObject();
            System.out.println(e.id);
            System.out.println(e.name);
        }
        catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
        catch(Exception ee)
        {
            System.out.println(ee.getMessage());
        }
    }
}
