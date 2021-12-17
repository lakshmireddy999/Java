package CoreJava;
import java.util.*;
public class Pattern {
    static void printPattern(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((i+j)<(n-1))
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        printPattern(n);

    }
}
