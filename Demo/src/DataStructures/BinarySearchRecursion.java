package DataStructures;

public class BinarySearchRecursion {
    static void binarySearchRec(int a[],int x,int l,int r)
    {
        if(l>r)
        {
            System.out.println("element not found");
            return;
        }
        int mid=(l+r)/2;
        if(a[mid]==x)
        {
            System.out.println("element found at index:"+mid);
            return;
        }
        else if(x>a[mid]) {
            l=mid+1;
            binarySearchRec(a, x, l, r);
        }
        else
        {
            r=mid-1;
            binarySearchRec(a,x,l,r);
        }
    }
    public static void main(String[] args) {
        int a[]={2,5,8,12,16,23,38,56,72};
        int x=23;
        binarySearchRec(a,x,0,a.length-1);
    }
}
