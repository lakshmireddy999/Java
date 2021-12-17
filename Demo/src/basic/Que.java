package basic;
import java.util.*;
public class Que {
    public static void main(String[] args) {
    ArrayList colors=new ArrayList();
    Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 colors");
    for(int i=0; i<10; i++)
    {
        String s=sc.nextLine();
        colors.add(s);
    }
        System.out.println(colors);
    ListIterator i=colors.listIterator();
    while(i.hasNext())
    {
        String str=(String) i.next();
        if(str.equals("pink"))
        {
            i.set("black");
        }
        if(str.equals("yellow"))
        {
            i.add("red");
        }
    }
        System.out.println(colors);
    }
}
