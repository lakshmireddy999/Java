package faculty;

import java.util.*;
public class Demo1 {

    public static void main(String args[]) {
        int a[] = {1, 2, 20,15,20,16,45,16,20,35,20};
        int l=a.length;
        int temp=0;
        int mul=l/3;
        ArrayList ar=new ArrayList();

        for(int i=0; i<mul; i=i+3)
        {
            for(int j=i; j<i+3; j++)
            {
                if(a[j]==20)
                    temp=1;
            }
            if(temp==1)
                ar.add(1);
            else
                ar.add(0);
        }
        temp=0;
            for(int i=mul*3; i<l; i++)
            {
                if(a[i]==20)
                    temp=1;
            }
            if(temp==1)
                ar.add(1);
            else
                ar.add(0);

        int flag=1;
        Iterator k=ar.iterator();
        while(k.hasNext())
        {
            if((Integer)k.next()==0)
            {
                flag=0;
            }
        }
        System.out.println(flag);
    }
}