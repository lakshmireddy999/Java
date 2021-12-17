package DataStructures;
import java.util.*;
import java.util.Queue;

class Graph
{
    int v;
    LinkedList<Integer> arr[];

    Graph(int v)
    {
        this.v=v;
        arr=new LinkedList[v];
        for(int i=0; i<v; i++)
        {
            arr[i]=new LinkedList();
        }
    }
    void addEdge(int s,int e)
    {
        arr[s].add(e);
    }
    void BFS(int s)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[v];
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int temp=q.poll();
            System.out.print(temp+" ");
            for(Integer x:arr[temp])
            {
                if(!visited[x])
                {
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
        System.out.println();
    }
    void print()
    {
        for(int i=0; i<v; i++)
        {
            System.out.print("neighbours of "+i+"are ");
            for(Integer x:arr[i])
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    void DfsUtil(int s,boolean visited[])
    {
        System.out.print(s+" ");
        visited[s]=true;
        for(Integer x:arr[s])
        {
            if(!visited[x])
            {
                DfsUtil(x,visited);
            }
        }
    }
    void DFS(int s)
    {
        boolean visited[]=new boolean[v];
        DfsUtil(s,visited);
    }
    void DfsOverall()
    {
        boolean visited[]=new boolean[v];
        int count=0;
        for(int i=0; i<v; i++)
        {
            if(!visited[i])
            {
                count++;
                DfsUtil(i,visited);
            }
        }
        System.out.println();
        System.out.println("connected component in graph:"+count);
    }
}
public class GraphLL {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 1);//we don't want a multiedge
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.print();
        System.out.println("-----BFS-----");
        g.BFS(0);
        System.out.println("-----DFS-----");
        g.DFS(0);
        System.out.println();
        System.out.println();
        g.DfsOverall();

    }
}
