package DataStructures;

public class CountWays {
    static int countR(int n)
    {
        if(n==0)return 1;
        if(n<3)return n;

        return countR(n-1)+countR(n-2)+countR(n-3);
    }
    static int countM(int n,int storage[])
    {
        if(n==0)return 1;
        if(n<3)return n;

        storage[n]=countM(n-1,storage)+countM(n-2,storage)+countM(n-3,storage);

        return storage[n];
    }
    static int countT(int n)
    {
        int storage[]=new int[n+1];
        storage[0]=1;
        storage[1]=1;
        storage[2]=2;
        for(int i=3; i<n+1; i++)
        {
            storage[i]=storage[i-1]+storage[i-2]+storage[i-3];
        }

        return storage[n];
    }
    public static void main(String[] args) {
        int n=7;
        int a[]=new int[n+1];
        System.out.println(countR(n));
        System.out.println(countM(n,a));
        System.out.println(countT(n));
    }
}
