package DataStructures;

class PrQueue
{
    final int capacity=10;
    int arr[]=new int[capacity];
    int size=0;

    boolean isEmpty()
    {
        return size==0;
    }
    void add(int data)
    {
        if(this.isEmpty())
        {
            arr[0]=data;
        }
        arr[size++]=data;
    }
    int peek()
    {
        if(this.isEmpty())
        {
            System.out.println("Priority Queue is empty");
            return -1;
        }
        int max=Integer.MIN_VALUE;

        for(int i=0; i<size; i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int poll()
    {
        if(this.isEmpty())
        {
            System.out.println("empty Queue");
            return -1;
        }
        int max=Integer.MIN_VALUE;

        for(int i=0; i<size; i++)
        {
            max=Math.max(max,arr[i]);
        }
        int i;
        for(i=0; arr[i]<max; i++)
        {

        }
        while(i<size-1)
        {
            arr[i]=arr[i+1];
        }
        size--;
        return max;
    }
}
public class PQueue2 {
    public static void main(String[] args) {
        PrQueue pq=new PrQueue();
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());
//        pq.add(10);
//        pq.add(5);
        for(int i=0; i<10; i++)
        {
            pq.add(i);
        }
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.size);

    }
}
