package DataStructures;

public class SumNNumbersDp {
    static int sumR(int n)
    {
        if(n<=1)return n;
        return n+sumR(n-1);
    }
    static int sumM(int n,int storage[])
    {
        storage[0]=0;
        storage[1]=1;
        if(storage[n]!=0)return storage[n];

        storage[n]=n+sumM(n-1,storage);
        return storage[n];
    }
    static int sumT(int n)
    {
        int storage[]=new int[n+1];
        storage[0]=0;
        storage[1]=1;
        for(int i=2; i<n+1; i++)
        {
            storage[i]=i+storage[i-1];
        }
        return storage[n];
    }
    public static void main(String[] args) {
        int n=120;

        System.out.println(sumT(n));
        System.out.println(sumR(n));
        int storage[]=new int[n+1];
        System.out.println(sumM(n,storage));

    }
}
