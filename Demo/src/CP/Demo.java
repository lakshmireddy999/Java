package CP;

import java.util.*;
public class Demo {


    public static void main(String[] args) {

        Integer a[]={2,5,9,9,9,9};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(Integer i:a)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        Arrays.sort(a,(i,j)->
        {
            if(mp.get(i)==mp.get(j))
            {
                return i-j;
            }
            else
                return mp.get(j)-mp.get(i);
        });
        for(Integer i:a)
        {
            System.out.print(i+" ");
        }
    }
}
