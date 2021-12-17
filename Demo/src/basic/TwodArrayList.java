package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class TwodArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A=new ArrayList();

        for(int i=1; i<=5; i++)
        {

            ArrayList a1=new ArrayList();
            for(int j=1; j<=5; j++)
            {
                a1.add(j);
            }
            A.add(a1);
        }

        System.out.println(A.get(0).get(1));
    }
}
