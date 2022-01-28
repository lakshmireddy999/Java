package CP;

import java.util.*;
public class DigitalSum {

    static int getdigit(int a)
    {
        if(a==0)return 0;

        return (a%9==0)?9:(a%9);
    }
    static String decode(int a[],int n)
    {
        for(int i=0; i<n; i++)
        {
            int temp=getdigit(a[i]);
            a[i]=temp;
        }
        String str="";
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==1)
            {
                str+=(char)(a[i]+96);
            }
            else
            {
                str+=a[i];
            }
        }
        return str;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int pinArray[]=new int[n];
        for(int i=0; i<n; i++)
        {
            pinArray[i]=sc.nextInt();
        }
        String pin=decode(pinArray,n);
        System.out.println(pin);
    }

}
