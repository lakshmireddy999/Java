package Mlp1;
import Mlp.Prasanna;

public class Lakshmi extends Prasanna {

     void info()
     {
         System.out.println("importing the package");
     }

     public static void main(String[] args)
     {
         Prasanna obj1=new Prasanna();
         Lakshmi obj2=new Lakshmi();
         obj2.info();
         int x=obj2.add(1,4);
         System.out.println("imported classes method is used"+x);
     }
}
