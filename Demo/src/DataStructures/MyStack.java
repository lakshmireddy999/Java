package DataStructures;

class Stack {
    final int size=10;
    int arr[]=new int[size];
    int top=-1;

    boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    void push(int data)
    {
        if(top>size-1)
        {
            System.out.println("stack overflow");
        }
        arr[++top]=data;

    }
    int peek()
    {
        if(this.isEmpty())
            return -1;
        else
            return arr[top];
    }
    int pop()
    {
        if(this.isEmpty())
            return -1;
        else
            return  arr[top--];
    }
}
public class MyStack {
    public static void main(String[] args) {
    Stack s=new Stack();
        System.out.println(s.pop());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());


    }
}
