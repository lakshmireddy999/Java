package CoreJava;
import  java.util.*;
public class PrimeNumbers {
    static boolean prime(int x)
    {
        if(x==1)
            return false;
        if(x==2)
            return true;
        int flag=0;
        for(int i=2; i<=Math.sqrt(x); i++)
        {
            if(x%i==0) flag=1;
        }
        if(flag==0)
            return  true;
        else
            return false;
    }
    static void findPrimes(int l,int h)
    {
        for(int i=l; i<=h; i++)
        {
            if(prime(i))
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter lower Number:");
        int low=sc.nextInt();
        System.out.println("Enter Higher Number:");
        int high=sc.nextInt();

        findPrimes(low,high);

    }
}
