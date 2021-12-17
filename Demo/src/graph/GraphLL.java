package graph;
import java.util.*;

class Graph
{
    int v; //No. of Vertices
    //int arr[]= new int[v];
    //String arr[] = new String[v];
    LinkedList<Integer> arr[];

    Graph(int v)
    {
        this.v = v;
        arr = new LinkedList[v]; //Only created an array to store a LinkedList

        for(int i=0;i<v;i++)
        {
            arr[i] = new LinkedList<>(); //Initializing empty LL's at each array Index
        }
    }

    void addEdge(int start, int end) //(u, v)
    {
        arr[start].add(end);
        //arr[end].add(start) //For Bidirectional Graph
    }

    void print()
    {
        for(int i=0;i<v;i++)
        {
            //Print the neighbors for v
            System.out.print("Neighbors of "+i+" are: ");
            for(Integer x:arr[i]) //One by one neighbors come in x
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    void BFS(int s)
    {
        System.out.println("----------BFS----------");
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty())
        {
            int temp = q.poll();
            System.out.print(temp + " ");
            //Neighbors of temp are at arr[temp]
            for(Integer x:arr[temp])
            {
                if(!visited[x])
                {
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
        System.out.println();
    }

    void DFS(int s)
    {
        System.out.println("----------DFS----------");
        boolean visited[] = new boolean[v];
        DFSUtil(s, visited); //Utility/Helper function - To pass the same array to the recursive calls.
        System.out.println();
    }

    void DFSUtil(int s, boolean visited[])
    {
        System.out.print(s + " ");
        visited[s] = true;
        for(Integer x:arr[s]) //neighbors come in x one by one
        {
            if(!visited[x]) //If neighbor not visited
            {
                DFSUtil(x, visited); //Do DFS on that neighbor
            }
        }
    }

    void DFSOverall()
    {
        System.out.println("-------DFS Overall-------");
        boolean visited[] = new boolean[v];
        int count = 0;
        for(int i=0;i<v;i++)
        {
            if(!visited[i]) //If not visited
            {
                DFSUtil(i, visited);
                System.out.println();
                count++; //Whenever a new separate component found
            }
        }
        System.out.println("Total connected components are: " + count);
    }
}

public class GraphLL {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 1);//we don't want a multiedge
//		g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
//		g.addEdge(3, 4);
        g.print();

        g.BFS(0);
        g.BFS(1);
        g.BFS(2);
        g.BFS(3);
        g.BFS(4);

        g.DFS(0);
        g.DFS(1);

        g.DFSOverall();
    }

}

