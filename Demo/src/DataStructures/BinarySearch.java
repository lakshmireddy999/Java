package DataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={2,5,8,12,16,23,38,56,72};
        int mid=0,l=0,r=a.length-1;
        int x=23;

        //Binary search
        while(l<=r)
        {
            mid=(l+r)/2;
            if(a[mid]==x) {
                System.out.println("Element found at index:" + mid);
                return;
            }
                else if(x<a[mid])
                r=mid-1;
            else
                l=mid+1;

        }
        System.out.println("Element not found");

    }
}
