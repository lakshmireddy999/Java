package DataStructures;

public class SubnetsumDP {
    static boolean sumR(int set[],int sum,int n)
    {
        if(sum==0)return true;

        if(n==0)return false;

        return sumR(set,sum,n-1)||sumR(set,sum-set[n-1],n-1);
    }

    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        System.out.println(sumR(set,sum,n));

    }
}
