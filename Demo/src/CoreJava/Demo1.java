package CoreJava;
import java.util.*;
public class Demo1 {
    static void printLine(int size)
    {
        System.out.print("+");
        for(int i=0; i<2*size; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
    static void printUpper(int size)
    {
        for(int row=0; row<size-1; row++)
        {
            System.out.print("|");
            for(int i=0; i<size-row-1; i++)
                System.out.print(" ");
            System.out.print("/");
            for(int i=0; i<2*row; i++)
            {
                if(row%2==0)
                    System.out.print("=");
                else
                    System.out.print("-");
            }
            System.out.print("\\");
            for(int i=0; i<size-row-1; i++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    static void printMiddle(int size)
    {
        System.out.print("|");
        System.out.print("<");
        for(int i=0; i<2*size-2; i++)
        {
           if(size%2==0)
               System.out.print("=");
           else
               System.out.print("-");
        }
        System.out.print(">");
        System.out.println("|");
    }
    static void printLower(int size)
    {
        for(int row=size-1; row>0; row--)
        {
            System.out.print("|");
            for(int i=size-row; i>0; i--)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int i=0; i<2*row-2; i++)
            {
                if(row%2==0)
                {
                    System.out.print("-");
                }
                else
                    System.out.print("=");
            }
            System.out.print("/");
            for(int i=size-row; i>0; i--)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
    static void printPattern(int size)
    {
        printLine(size);
        printUpper(size);
        printMiddle(size);
        printLower(size);
        printLine(size);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter size of Diamond");
//        int n=sc.nextInt();
            printPattern(7);
    }
}
