package DataStructures;

public class EditDistanceDp {
    static int editR(String s1,String s2,int m,int n)
    {
        if(n==0)return m;
        if(m==0)return n;

        if(s1.charAt(m-1)==s2.charAt(n-1))
            return editR(s1,s2,m-1,n-1);

        int replace=1+editR(s1,s2,m-1,n-1);
        int insert=1+editR(s1,s2,m,n-1);
        int remove=1+editR(s1,s2,m-1,n);

        return Math.min(replace,Math.min(insert,remove));
    }
    static int editM(String s1,String s2,int m,int n,int dp[][])
    {
        if(n==0)return m;
        if(m==0)return n;

        if(dp[m][n]!=0)return dp[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1))
            return editM(s1,s2,m-1,n-1,dp);

        int replace=1+editM(s1,s2,m-1,n-1,dp);
        int insert=1+editM(s1,s2,m,n-1,dp);
        int remove=1+editM(s1,s2,m-1,n,dp);

        dp[m][n]=Math.min(replace,Math.min(insert,remove));
        return dp[m][n];
    }
    static int editT(String s1,String s2,int m,int n)
    {
        if(n==0)return m;
        if (m==0)return n;

        int dp[][]=new int[m+1][n+1];

        if(dp[m][n]!=0)return dp[m][n];

        for(int i=0; i<m+1; i++)
        {
            for(int j=0; j<n+1; j++)
            {
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bcde";
        System.out.println(editR(s1,s2,s1.length(),s2.length()));

        int dp[][]=new int[s1.length()+1][s2.length()+1];

        System.out.println(editM(s1,s2,s1.length(),s2.length(),dp));
        System.out.println(editT(s1,s2,s1.length(),s2.length()));
    }
}
