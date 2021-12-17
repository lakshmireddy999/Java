package CoreJava;
import java.util.*;

public class PrintingPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        //1
       for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        //2
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //3
        int k;
        if(n%2==0)
            k=n/2;
        else
            k=n/2+1;
        for(int i=0; i<n; i++)
        {
            if(i<k)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int j=n; j>i; j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        System.out.println("\n");


        //4
      for(int i=1;i<=n;i++)
        {
           for(int j=1; j<=n; j++)
           {
               if((i+j)>n)
               {
                   System.out.print("* ");
               }
               else
                   System.out.print("  ");
           }
            System.out.println();
        }
        System.out.println("\n");

        //5
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i+j)>n)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //6
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //7
        k=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }


    }
}