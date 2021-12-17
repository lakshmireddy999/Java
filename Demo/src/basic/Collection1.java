package basic;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        for(int i=1; i<=5; i++)
        {
            a.add(i);
        }
        System.out.println(a.hashCode());
        int arr[]=new int[5];
        Object o[]=new Object[5];
        o=a.toArray();
        for(int i=0; i<5  ;i++)
        {
            arr[i]=(int)o[i];
            System.out.print(arr[i]+"  ");
        }
    }
}
