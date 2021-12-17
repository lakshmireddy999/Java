package DataStructures;

public class Mylldeletion extends Node {

    static Node insert(Node head, int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    static Node sortedInsert(Node head, int data)
    {
        if(head==null)
            return new Node(data);

        Node n=new Node(data);
        Node temp=head;
        Node save=null;
        while(temp!=null && temp.data<data)
        {
            save=temp;
            temp=temp.next;
        }
        if(save==null)
        {
            return insert(head,data);
        }
        n.next=temp;
        save.next=n;

        return head;
    }
    static void print(Node head)
    {
        if (head==null)
        {
            System.out.println("No elements present");
        }
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node deleteAtEnd(Node head)
    {
        if(head==null)
        {
            System.out.println("underflow");
            return null;
        }
        Node last=head;
        Node blast=null;
        while(last.next!=null)
        {
            blast=last;
            last=last.next;
        }
        if(blast==null)
            return null;
        else
            blast.next=null;


        return head;
    }
    static Node deleAtpos(Node head, int pos)
    {
        if(head==null) {
            System.out.println("underflow");
            return null;
        }
        if(pos==1)
            return null;

        Node last=head;
        for(int i=1; i<pos-1; i++)
        {
            last=last.next;
        }
        last.next=last.next.next;
        return head;
    }
    static Node deleteAtStart(Node head)
    {
        if(head==null)
        {
            System.out.println("underflow");
            return null;
        }
        head=head.next;
        return head;

    }
    public static void main(String[] args) {
        Node head=null;
        for(int i=20; i>=1; i=i-2)
        {
            head=insert(head,i);
        }

        print(head);

        head=sortedInsert(head,1);
        print(head);
       head=deleteAtStart(head);
       print(head);

        head=deleteAtEnd(head);
        print(head);

        int pos=5;
        head=deleAtpos(head,pos);
        print(head);

    }
}
