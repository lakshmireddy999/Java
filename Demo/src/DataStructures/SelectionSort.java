package DataStructures;

public class SelectionSort {
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sSort(int arr[],int n)
    {
        for(int i=0; i<n-1;i++ )
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i)
                swap(arr,i,min);
        }
    }
    static void display(int ar[],int n)
    {
        for(int i=0; i<n; i++)
            System.out.print(ar[i]+" ");
    }
    public static void main(String[] args) {
        int  a[]={10,9,5,3,4,7,1,2,6,8};
        sSort(a,a.length);
        display(a,a.length);
    }
}
