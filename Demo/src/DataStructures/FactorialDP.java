package DataStructures;
import java.util.*;
public class FactorialDP {
    static int factR(int n)
    {
        if(n==0|| n==1)return 1;

        return n*factR(n-1);
    }
    static int factM(int n,int dp[])
    {
        if(n==0 || n==1)dp[n]=1;

        if(dp[n]!=0)return dp[n];

        dp[n]= n*factM(n-1,dp);

        return dp[n];
    }
    static int factT(int n)
    {
        if(n==0 || n==1)return 1;
        int []dp=new int [n+1];

        for(int i=0; i<n+1; i++)
        {
            if(i==0 || i==1)dp[i]=1;
            else
                dp[i]=i*dp[i-1];
        }

        return dp[n];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println(factR(n));
        int dp[]=new int[n+1];
        System.out.println(factM(n,dp));
        System.out.println(factT(n));
    }
}
