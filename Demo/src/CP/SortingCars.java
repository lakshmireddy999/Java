package CP;
import java.util.*;
public class SortingCars {
    static int distance(int x,int y)
    {
        return (int)Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0,2));
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>ar=new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            ar.add(new ArrayList<>());
        }
        ar.get(0).add(2);
        ar.get(0).add(3);
        ar.get(1).add(8);
        ar.get(1).add(9);
        ar.get(2).add(6);
        ar.get(2).add(8);
        ar.get(3).add(4);
        ar.get(3).add(2);
        ar.get(4).add(10);
        ar.get(4).add(11);

        TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<>();

        for(int i=0; i<5; i++)
        {
            int x=ar.get(i).get(0);
            int y=ar.get(i).get(1);
            int d=distance(x,y);
            mp.put(d,new ArrayList<>(ar.get(i)));
        }

        for(Integer i:mp.keySet())
        {
            System.out.println("distance:"+i+"  "+"coordinate"+mp.get(i));
        }
    }
}
