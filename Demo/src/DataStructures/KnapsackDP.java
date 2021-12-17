package DataStructures;

public class KnapsackDP {
    static int knapsackR(int w,int wt[],int val[],int n)
    {
        if(w==0 ||n==0)return 0;

        if(wt[n-1]>w)
            return knapsackR(w,wt,val,n-1);

        return Math.max(knapsackR(w-wt[n-1],wt,val,n-1)+val[n-1],knapsackR(w,wt,val,n-1));
    }
    static int knapsackM(int w,int wt[],int val[],int n,int dp[][])
    {
        if(n==0 || w==0)return 0;

        if(dp[n][w]!=0)return dp[n][w];

        if(wt[n-1]>w)
            return knapsackM(w,wt,val,n-1,dp);

        dp[n][w]=Math.max(knapsackM(w-wt[n-1],wt,val,n-1,dp)+val[n-1],knapsackM(w,wt,val,n-1,dp));

        return dp[n][w];
    }
    static int knapsackT(int w,int wt[],int val[],int n)
    {
        if(n==0 ||w==0)return 0;
        int dp[][]=new int[n+1][w+1];

        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<w+1; j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(wt[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int n=3;
        int w=50;
        int wt[]={10,20,30};
        int val[]={120,80,60};
        System.out.println(knapsackR(w,wt,val,n));
        int dp[][]=new int[n+1][w+1];
        System.out.println(knapsackM(w,wt,val,n,dp));
        System.out.println(knapsackT(w,wt,val,n));
    }
}
