package DataStructures;

import java.util.*;
public class TwodArrayList
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ar=new ArrayList();
        //ar.add(new ArrayList<>());
        for(int i=0; i<5; i++)
        {
            ar.add(new ArrayList<>());
        }
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                ar.get(i).add(j);
            }
        }
        for(int i=0; i<ar.size(); i++)
        {
            for(int j=0; j<ar.get(i).size(); j++) {
                System.out.print(ar.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}