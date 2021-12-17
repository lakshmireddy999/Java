package DataStructures;

import java.util.*;

public class ArrayTripletSum {
    static boolean findTriplet(int arr[],int n)
    {
        Arrays.sort(arr);

        for (int i=0; i<n-1; i++)
        {
            int j=i+1;
            int k=n-1;
            int x=arr[i];
            while(j<k)
            {
                if(x+arr[j]+arr[k]==0)
                {
                    System.out.println("triplets are:"+x+","+arr[j]+","+arr[k]);
                    j++;
                    k--;

                    return true;
                }
                else if(x+arr[k]+arr[j]<0)
                    j++;
                else
                    k--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={45,-27,61,-34,45};

        System.out.println(findTriplet(arr, arr.length));

    }
}
