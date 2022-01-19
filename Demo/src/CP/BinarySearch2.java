//find the single element in sorted array which is not repeated twice
package CP;
import java.util.*;
public class BinarySearch2 {
    static int check(int arr[])
    {

        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r) /2;
            if((mid==0 || arr[mid-1]!=arr[mid]) && (mid== arr.length-1 || arr[mid]!=arr[mid+1]))
            {
                return arr[mid];
            }
            else if(mid%2==0)
            {
                if(arr[mid+1]==arr[mid])
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
            else
            {
                if(arr[mid+1]==arr[mid])
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={7};
        System.out.println(check(arr));
    }

}