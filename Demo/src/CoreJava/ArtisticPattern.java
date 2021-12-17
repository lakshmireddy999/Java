package CoreJava;
import java.util.*;
public class ArtisticPattern {
   static void printTopOrBottom(int size)
    {
        System.out.print("+");
        for(int i=0; i<2*size; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");

    }
    static void printUpperPart(int size)
    {
        for(int row=0; row<size-1; row++)
        {
            System.out.print("|");//1
            for(int i=0; i<size-row-1; i++)//2
            {
                System.out.print(" ");
            }
            System.out.print("/");//3
            for(int i=0; i<2*row; i++)//4
            {
                if(row%2==0)
                    System.out.print("=");
                else
                    System.out.print("-");
            }
            System.out.print("\\");//5
            for(int i=0; i<size-row-1; i++)//6
            {
                System.out.print(" ");
            }
            System.out.println("|");//6

        }
    }
    static void printMiddleLine(int size)
    {
        System.out.print("|");
        System.out.print("<");

        for(int i=0; i<2*size-2; i++)
        {
            if(size%2==0)
                System.out.print("-");
            else
                System.out.print("=");
        }

        System.out.print(">");
        System.out.println("|");
    }
    static void printLowerPart(int size)
    {
        for(int row=size-1; row>0; row--)
        {
            System.out.print("|");//1
            for (int i=size-row; i>0; i--)//2
            {
                System.out.print(" ");
            }
            System.out.print("\\");//3
            for(int i=0; i<2*(row-1); i++)//4
            {
                if(row%2==0)
                    System.out.print("-");
                else
                    System.out.print("=");
            }
            System.out.print("/");//5
            for(int i=size-row; i>0; i--)//6
            {
                System.out.print(" ");
            }
            System.out.println("|");//7
        }

    }
   static void printpattern(int size)
    {
        printTopOrBottom(size);//printing firstLine
        printUpperPart(size);
        printMiddleLine(size);
        printLowerPart(size);
        printTopOrBottom(size);//printing firstLine

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Diamond");
        int size=sc.nextInt();
        printpattern(size);

    }
}

