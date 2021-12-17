package basic;
import java.util.*;
//storing in descending order in Treeset
class Mycomparator<T> implements Comparator<T>
{
    public int compare(T o1, T o2)
    {
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;

        //return i1.compareTo(i2);//ascending
        //return i2.compareto(i1);//descending
        //return -i1.compareTo(i2);//descending
        return -i2.compareTo(i1);//ascending
    }
}
public class Collection6 {
    public static void main(String[] args) {
        Set s=new TreeSet(new Mycomparator());

        s.add(3);
        s.add(1);
        s.add(4);
        s.add(2);
        s.add(5);
        System.out.println(s);
    }
}
