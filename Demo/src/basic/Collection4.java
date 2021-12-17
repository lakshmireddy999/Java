package basic;
import java.util.*;
//using set
public class Collection4 {
    public static void main(String[] args) {
        Set s=new HashSet();

        System.out.println(s.add(1));
        System.out.println(s.add(4));
        System.out.println(s.add(2));
        System.out.println(s.add(3));

        System.out.println(s.add(4));


        Object o[]=s.toArray();
        Integer arr[]=new Integer[5];
        for(int i=0;i<4;i++)
        {
            arr[i]=(Integer) o[i];
        }
        for(int i=0;i<4;i++)
            System.out.print(arr[i]+"  ");
    }
}
