package CP;

import java.util.*;

public class ArrayReduce {
    public static void main(String[] args) {
        int a[]={10,16,7,14,5,3,12,9};

        Map<Integer,Integer>mp=new TreeMap<>();
        for(int i=0; i<a.length; i++)
        {
            mp.put(a[i],mp.getOrDefault(a[i],i));
        }
        int count=0;
        for(Integer i:mp.keySet())
        {
            a[mp.get(i)]=count;
            count++;
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
