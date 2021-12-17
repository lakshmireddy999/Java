package basic;
import java.util.*;
public class Collection8 {
    public static void main(String[] args) {
        Deque d=new LinkedList();

        d.addFirst(1);
        d.add(null);
        d.add(2);

        System.out.println(d);

        Iterator itr=d.iterator();
        while (itr.hasNext())
        {
            if(itr.next()==null)
                itr.remove();
        }
        System.out.println(d);
    }
}
