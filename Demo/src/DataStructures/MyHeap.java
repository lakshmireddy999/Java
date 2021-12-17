package DataStructures;

class Heap
{
    final int capacity=10;
    int []arr=new int[capacity];
    int size=0;

    boolean isEmpty()
    {
        return size==0;
    }
    int getleftChildIndex(int i)
    {
        return 2*i+1;
    }
    int getRightChildIndex(int i)
    {
        return 2*i+2;
    }
    int getParentIndex(int i)
    {
        return (i-1)/2;
    }
    int getParent(int i)
    {
        return arr[getParentIndex(i)];
    }
    int getLeftChild(int i)
    {
        return arr[getleftChildIndex(i)];
    }
    int getRightChild(int i)
    {
        return arr[getRightChildIndex(i)];
    }
    int peek()
    {
        if(this.isEmpty())
        {
            System.out.println("heap is empty");
            return -1;
        }
        return arr[0];
    }
    int getSize()
    {
        return size;
    }
    void swap(int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void heapifyUp()
    {
        int curr=size-1;
        while(getParentIndex(curr)>=0 && getParent(curr)<arr[curr])
        {
            swap(curr,getParentIndex(curr));
            curr=getParentIndex(curr);
        }
    }
    void add(int data)
    {
        if(this.isEmpty())
        {
            arr[0]=data;
            size++;
            return;
        }

        arr[size]=data;
        size++;
        heapifyUp();
    }

    void hepifyDown()
    {
        int curr=0;
        int largeIndex=getleftChildIndex(curr);
        while (getleftChildIndex(curr)<size)
        {
            if(getRightChild(curr)>getLeftChild(curr))
            {
                largeIndex=getRightChildIndex(curr);
            }
            if(arr[largeIndex]>arr[curr]) {
                swap(largeIndex, curr);
                curr = largeIndex;
            }
            else
            {
                break;
            }
        }
    }
    int poll()
    {
        int element=arr[0];
        arr[0]=arr[size-1];
        size--;
        hepifyDown();
        return element;
    }
}
public class MyHeap {
    public static void main(String[] args) {
        Heap h=new Heap();
        System.out.println(h.isEmpty());
        int[] a ={10,20,5,15,3,4,6,9,11};
        for (int j : a) {
            h.add(j);
        }
        System.out.println(h.peek());
        System.out.println(h.getSize());
        System.out.println(h.poll());
        System.out.println(h.peek());
        System.out.println(h.poll());
        System.out.println(h.peek());
        System.out.println(h.poll());
        System.out.println(h.peek());


    }
}
