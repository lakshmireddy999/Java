package DataStructures;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node()
    {

    }
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class MyLl {
    static Node insertAtHead(Node head, int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
        return head;
    }
    static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node insertAtPosition(Node head, int pos, int data)
    {
        if(head==null) return new Node(data);

        Node n=new Node(data);
        Node last=head;
        if(pos==1)
        {
            n.next=head;
            head=n;
            return head;
        }
        for(int i=1; i<pos-1; i++)
        {
            last=last.next;
        }
        n.next=last.next;
        last.next=n;

        return head;
    }
    static Node insertAtEnd(Node head, int data)
    {
        if(head==null)return new Node(data);

        Node newNode=new Node(data);
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newNode;
        return head;
    }
    public static void main(String[] args)
    {
        Node head=null;
        int c=1;
        Scanner sc=new Scanner(System.in);
        while(c>0 && c<5)
        {
            System.out.print("\n1.insert at start\n2.insert at nth pos\n3.insert at end\n4.Traverse\n");
            c= sc.nextInt();
            switch (c)
            {
                case 1:
                {
                    System.out.println("enter data to insert");
                    int data=sc.nextInt();
                    head=insertAtHead(head,data);
                    break;
                }
                case 2:
                {
                    System.out.println("enter the position to insert");
                    int pos=sc.nextInt();
                    System.out.println("enter data to insert");
                    int data=sc.nextInt();
                    head=insertAtPosition(head,pos,data);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter data to insert");
                    int data=sc.nextInt();
                    head=insertAtEnd(head,data);
                    break;
                }
                case 4:
                {
                    print(head);
                    break;
                }
                default:
                {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }

    }
}
