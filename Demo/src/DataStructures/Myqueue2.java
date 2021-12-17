package DataStructures;
class QNode
{
    int data;
    QNode next;
    QNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class QueNode
{

    QNode front=null;
    QNode rear=null;


    boolean isEmpty()
    {
        return (front==null && rear==null);
    }
    void enqueue(int data)
    {
        if(this.isEmpty())
        {
            QNode temp=new QNode(data);
            front=temp;
            rear=temp;
            return;
        }
        QNode temp=new QNode(data);
        rear.next=temp;
        rear=temp;
    }
    int peek()
    {
        if(front==null)
        {
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }
    int dequeue()
    {
        if(this.isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        int temp=front.data;
        front=front.next;
        return temp;
    }
}
public class Myqueue2 {

    public static void main(String[] args) {
       QueNode q=new QueNode();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.dequeue());

        for(int i=1; i<=5; i++)
        {
            q.enqueue(i);
        }
        System.out.println(q.isEmpty());
        System.out.println(q.peek());

        for(int i=1; i<=5; i++)
        {
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());

    }
}
