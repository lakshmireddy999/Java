package CP;

import java.util.*;

public class SortwithComparator {
    public static void main(String[] args) {

        String a[]={"Lakshmi","Reddy","Abc"};
        Arrays.sort(a,new Comparator<String>()
        {
            public int compare(String a,String b)
            {
                return (a.compareTo(b)>0)?-1:1;
            }
        });
        for(String i:a)
        {
            System.out.print(i+" ");
        }
    }
}
