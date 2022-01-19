/*searching for the element in the array if present else returning the position at which it can be
inserted and array remains sorted*/
package CP ; // don't place package name! */
import java.util.*;
import java.lang.*;

 /* Name of the class has to be "Main" only if the class is public. */
public class BinarySearch
{
    static  int binarySearch(int arr[],int key)
    {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        while(t-->0)
        {
            int key=sc.nextInt();
            System.out.println(binarySearch(arr,key));
        }
    }
}