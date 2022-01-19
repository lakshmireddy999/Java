//frequency of an element in sorted array using BS
package CP;
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BinarySearch3
{
    static int first(int arr[],int l,int r,int key)
    {
        int res=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;

            if(key>arr[mid])
            {
                l=mid+1;
            }
            else if(key<arr[mid])
            {
                r=mid-1;
            }
            else
            {
                res=mid;
                r=mid-1;
            }
        }
        return res;
    }
    static int last(int arr[],int l,int r,int key)
    {
        int res=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;

            if(key>arr[mid])
            {
                l=mid+1;
            }
            else if(key<arr[mid])
            {
                r=mid-1;
            }
            else
            {
                res=mid;
                l=mid+1;

            }
        }
        return res;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,2,3,4,5};
        int n= arr.length;
        int key=2;

        int i=first(arr,0,n-1,key);
            if(i==-1)
            {
                System.out.println(0);
            }
            else
            {
                int j=last(arr,i,n-1,key);
                System.out.println(j-i+1);
            }

    }
}

