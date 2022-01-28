package CP;

import java.util.*;
public class MergeSort {
    static void merge(int arr[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0; i<n1; i++)
        {
            a[i]=arr[l+i];
        }
        for(int i=0; i<n2; i++)
        {
            b[i]=arr[i+m+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                arr[k++]=b[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        while(j<n2)
        {
            arr[k++]=b[j++];
        }
    }
    static void mergeSort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);

            merge(a,l,m,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={4,1,3,9,7};
        mergeSort(a,0,a.length-1);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
