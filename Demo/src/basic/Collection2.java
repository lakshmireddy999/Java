package basic;

import java.util.ArrayList;
import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(21);
        a.add(30);

        Iterator i=a.iterator();

        while(i.hasNext())
        {
            int num=(int)i.next();
            if(num%2!=0)
            {
                i.remove();
            }
        }
        System.out.println(a);
    }
}
