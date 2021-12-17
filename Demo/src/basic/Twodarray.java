package basic;

import java.util.Scanner;

public class Twodarray {

    void perc(float a[][],int n)
    {
       float sum[]=new float[4];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                sum[i]=sum[i]+a[i][j];
            }
            sum[i]=(sum[i]/(a[i].length*100))*100;
        }
        System.out.println("percentages of students");
        for(int i=0; i<4; i++)
        {
            System.out.println((i+1)+": "+sum[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       float marks[][]=new float[4][];
        marks[0]=new float[5];
        marks[1]=new float[2];
        marks[2]=new float[1];
        marks[3]=new float[4];

        for(int i=0;i<4;i++)
        {
            System.out.println("Enter marks for student"+(i+1));
            for(int j=0;j<marks[i].length;j++)
            {
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.print("Marks of student"+(i+1));
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]+"\t");
            }
            System.out.println();
        }
        Twodarray d=new Twodarray();
        d.perc(marks,4);
    }
}
