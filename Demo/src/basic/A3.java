package basic;

import java.util.Scanner;
public class A3 {
    int[]  convert(double d[])
    {
        int c[]=new int[d.length];
        for(int i=0; i<d.length; i++)
        {
            c[i]=(int)d[i];
        }
        return c;
    }
    public static void main(String[] args) {
        double a[]=new double[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements into array");
        for(int i=0; i<4; i++)
        {
            a[i]=sc.nextInt();
        }
        A3 obj=new A3();

      int[]  b=obj.convert(a);
        System.out.println("converted array");
        for(int i=0; i<b.length; i++)
        {
            System.out.print(b[i]+"\t");
        }
    }
}
