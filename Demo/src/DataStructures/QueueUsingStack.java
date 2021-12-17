package DataStructures;
import java.util.Stack;
public class QueueUsingStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
     void push(int d)
    {

        while(!s1.isEmpty())
        {
            s2.add(s1.pop());
        }
        s1.add(d);
        while(!s2.isEmpty())
        {
            s1.add(s2.pop());
        }

    }
    int poll()
    {
        if(s1.isEmpty() ) return -1;

        return s1.pop();
    }
    public static void main(String[] args) {
       QueueUsingStack q1=new QueueUsingStack();
        for(int i=1; i<=4; i++)
        {
            q1.push(i);
        }
        System.out.println(q1.poll());

    }
}
