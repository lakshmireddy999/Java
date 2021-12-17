package DataStructures;

class Queue
{
    final int size=10;
    int arr[]=new int[size];
    int front=-1;
    int rear=-1;

    boolean isEmpty()
    {
        return (front==-1 && rear==-1);
    }
    void enqueue(int data)
    {

        if(front==(rear+1)%size)
        {
            System.out.println("queue is full");
            return;
        }
        if(this.isEmpty())
        {
            front++;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    int peek()
    {
        if(this.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }
    int dequeue()
    {
        if(this.isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        if(front==(rear+1)%size)
        {
            int x=arr[front];
            front=(front+1)%size;
            return x;
        }
        int x=arr[front];
        front=(front+1)%size;
        return x;
    }
}
public class MyQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.dequeue());

        for(int i=1; i<=10; i++)
        {
            q.enqueue(i);
        }
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
//        q.enqueue(14);
        for(int i=0; i<7; i++)
        {
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());
    }
}
