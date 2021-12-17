package DataStructures;

public class Fibonacci {
    static int fibonacci(int n)
    {
        if(n<2)return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    static  int fibM(int n,int storage[])
    {
        if(n<2)return n;

        storage[n]= fibM(n-1,storage)+fibM(n-2,storage);
        return storage[n];
    }
    static int fibT(int n)
    {
        int storage[]=new int[n+1];
        storage[0]=0;
        storage[1]=1;

        if(storage[n]!=0)return storage[n];
        for(int i=2; i<n+1; i++)
        {
            storage[i]=storage[i-1]+storage[i-2];
        }
        return storage[n];
    }
    public static void main(String[] args) {
        int n=25;
        int a[]=new int[n+1];
        System.out.println(fibT(n));
        System.out.println(fibonacci(n));
        System.out.println(fibM(n,a));

    }
}
