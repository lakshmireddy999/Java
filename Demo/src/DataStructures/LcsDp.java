package DataStructures;

public class LcsDp {
    static int lcsR(String s1,String s2,int m,int n)
    {
        if(n==0||m==0)return 0;

        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1+lcsR(s1,s2,m-1,n-1);
        }
        return Math.max(lcsR(s1,s2,m-1,n),lcsR(s1,s2,m,n-1));
    }
    static int lcsM(String s1,String s2,int m,int n,int dp[][])
    {
        if(n==0||m==0)return 0;

        if(dp[m][n]!=0)return dp[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1+lcsM(s1,s2,m-1,n-1,dp);
        }

        dp[m][n]=Math.max(lcsM(s1,s2,m-1,n,dp),lcsM(s1,s2,m,n-1,dp));
        return dp[m][n];
    }
    static int lcsT(String s1,String s2,int m, int n)
    {
        if(n==0 || m==0)return 0;
        int dp[][]=new int[m+1][n+1];
        for(int i=0; i<m+1; i++)
        {
            for(int j=0; j<n+1; j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="lakshmireddy";
        String s2="hmir";
        System.out.println(lcsT(s1,s2,s1.length(),s2.length()));
        System.out.println(lcsR(s1,s2,s1.length(),s2.length()));
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        System.out.println(lcsM(s1,s2,s1.length(),s2.length(),dp));

    }
}
