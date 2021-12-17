package DataStructures;

public class findKElementInXwindows {
    static boolean findKeySegment(int []a,int x,int k)
    {
        int i=0;

        boolean b=false;
        for(i=0; i<a.length; i+=k)
        {
            b=false;
            for(int j=i; j<i+k && j<a.length; j++)
            {
                if(a[j]==k)
                {
                    b=true;
                }
            }
            if(b==false)
                return false;
        }
        for(int j=(a.length/x)*x; j<a.length; j++)
        {
            if(a[j]==k)
                b=true;
        }
        return b;
    }
    public static void main(String[] args) {
        int []a={ 5, 8, 7, 12, 14, 3, 9};
        int x=8,k=2;
        System.out.println(findKeySegment(a,x,k));
    }
}
