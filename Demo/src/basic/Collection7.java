package basic;
import java.util.*;
//adding objects to sets
class Employee implements Comparable
{
    int id;
    String name;

    Employee(int i,String n)
    {
        id=i;
        name=n;
    }
    public String toString()
    {
        return id+" : "+name;
    }
    public int compareTo(Object o)
    {
        int id1=this.id;
        int id2=((Employee)o).id;
        if(id1>id2) return 1;
        else if(id1<id2) return -1;
        else return 0;
    }
}

public class Collection7
{
    public static void main(String[] args)
    {
        Employee e1=new Employee(101,"John");
        Employee e2=new Employee(100,"Sara");
        Employee e3=new Employee(103,"Smith");

        Set s=new TreeSet();
        s.add(e1);
        s.add(e2);//e2.compareTo(e1);
        s.add(e3);
        System.out.println(s);
    }
}

