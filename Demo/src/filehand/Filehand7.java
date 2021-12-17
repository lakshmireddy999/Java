package filehand;
//serialization

import java.io.*;
class Employee implements Serializable
{
    int id;
    String name;
}
public class Filehand7  {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.id=101;
        e.name="Lakshmi";

        try
        {
            FileOutputStream fo=new FileOutputStream("Employee.txt");
            ObjectOutputStream oo=new ObjectOutputStream(fo);
            oo.writeObject(e);
            oo.flush();
            oo.close();
        }
        catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }
        try
        {
            FileInputStream fi=new FileInputStream("Employee.txt");
            ObjectInputStream oi=new ObjectInputStream(fi);
            e=(Employee) oi.readObject();
            System.out.println(e.id);
            System.out.println(e.name);
        }
        catch(Exception ie)
        {
            System.out.println(ie.getMessage());
        }
    }
}
