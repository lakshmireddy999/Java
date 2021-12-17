package DataStructures;



public class MyStack2 extends Node {
   static boolean isEmpty(Node head)
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
   static Node push(Node head, int data)
    {
        if(head==null)
            return new Node(data);

        Node n=new Node(data);
        n.next=head;
        head=n;
        return head;
    }
    static int peek(Node head)
    {
        if(head==null)return -1;
        return head.data;
    }
    static Node pop(Node head)
    {
        if(head==null)return null;

        int temp=head.data;
        head=head.next;
        System.out.println(temp);
        return head;
    }

    public static void main(String[] args) {
    Node head=null;
        System.out.println(isEmpty(head));
        head=push(head,10);
        head=push(head,20);
        System.out.println(isEmpty(head));
        System.out.println(peek(head));
        head=pop(head);
        System.out.println(peek(head));

        System.out.println(Math.pow(2,Math.pow(3,2)));
    }
}
