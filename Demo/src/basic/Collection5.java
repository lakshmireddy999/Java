package basic;
import java.util.*;
//Treeset
public class Collection5 {
    public static void main(String[] args) {

        Set fr=new TreeSet();
        fr.add("guava");
        fr.add("papaya");
        System.out.println(fr);
        Set s=new TreeSet();

        s.add(2);
        s.add(1);
        s.add(3);

        System.out.println(s);
    }
}
