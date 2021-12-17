package DataStructures;

public class Arraytobst {
    static int len=0;
    static long insert(int i,long a[])
    {
        long g=0;
        for(int j=i; j<a.length; j++)
        {
            if(a[j]>a[i])
            {
                g=a[j];
                return g;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        long a[]={1,3,2,4};
        long res[]=new long[a.length];
        res[a.length-1]=-1;

        for(int i=0; i< res.length-1; i++)
        {
            res[i]=insert(i,a);
        }

        for(int i=0; i< res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}

