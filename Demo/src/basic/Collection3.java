package basic;

import java.util.*;
public class Collection3 {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);

        ListIterator itr=l.listIterator(5);int t;
        while(itr.hasNext())
        {
            t=(int) itr.next();
            if(t%2==0)
                System.out.println(t);
        }

        List m=l.subList(2,6);
        System.out.println(m);
    }
}
