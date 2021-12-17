package CoreJava;
import java.util.*;
public class ArmstrongNumber {
    static boolean findArmstrong(int n,int l)
    {

        int Arm=0,rmd=0;
        int temp=n;
        while(n!=0)
        {
            rmd=n%10;
            Arm+=Math.pow(rmd,l);
            n=n/10;
        }
        if(temp==Arm)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if it is Armstrong number or not:");
        int n=sc.nextInt();
        int l =Integer.toString(n).length();
        //int l=s.length();

        if(findArmstrong(n,l))
            System.out.println("Yes ");
        else
            System.out.println("No");
    }
}
