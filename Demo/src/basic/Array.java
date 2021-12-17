package basic;

import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        int[] a;//declaration
        a=new int[10];//memory allocation
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();//array initialization
        }

        for(int i=0;i<10;i++)
        {
         if(a[i]==47) {
             flag=1;
             System.out.println("47 is found");
         }
        }
        if(flag==0)
            System.out.println("47 not found");


    }
}