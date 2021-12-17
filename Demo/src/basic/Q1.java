package basic;

import java.util.Scanner;

public class Q1 {
    float perc(int a[])
    {
       float sum=0;
       for(int i=0; i<a.length; i++)
       {
           sum+=a[i];
       }
       return sum/a.length;
    }
    public static void main(String[] args) {
        Q1 obj=new Q1();
        int[] marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of subjects");
        int s=sc.nextInt();
        marks=new int[s];
        System.out.println("enter the marks");
        for(int i=0; i<s;i++)
        {
            marks[i]=sc.nextInt();
        }
        float percentage=obj.perc(marks);

        System.out.println("percentage:"+percentage);
    }
}
