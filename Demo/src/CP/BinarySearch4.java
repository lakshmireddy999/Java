//finding any of the peak value in the mountain type array using BS
package CP;
public class BinarySearch4 {
    static int findPeakElement(int[] arr) {

        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid]>arr[mid+1]))
            {
                return mid;
            }
            else if(arr[mid+1]>arr[mid])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,5,1};
        System.out.println(findPeakElement(arr));
    }
}
