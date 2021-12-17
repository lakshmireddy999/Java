package faculty;

import java.util.Scanner;

public class ExceptionHand2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,total=0;
        int a[]=new int[5];
        System.out.println("enter marks");
        try
        {
            for(int i=0; i<5; i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            System.out.println("enter total marks");
             total=sc.nextInt();
            System.out.println("percentage:"+(sum*100/total));
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("array limit exceeded");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Total marks cannot be zero"+e.getMessage());
        }
    }
}
