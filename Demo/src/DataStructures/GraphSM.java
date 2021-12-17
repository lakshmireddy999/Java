package DataStructures;


import java.util.*;
import java.util.Queue;

class GraphSetMap
{
    HashMap<Integer, HashSet<Integer>> graph=new HashMap<>();

    void addVertex(int d)
    {
        if(graph.containsKey(d))
        {
            System.out.println("Vertex "+d+" Already exists");
            return;
        }
        graph.put(d,new HashSet<Integer>());
    }
    void addEdge(int s,int e)
    {
        graph.get(s).add(e);
    }
    void print()
    {
        System.out.println("vertices are"+graph.keySet());
        for(Integer x: graph.keySet())
        {
            System.out.print("Neighbours of "+x+" are ");
            System.out.println(graph.get(x)+" ");
        }

    }
    void BFS(int s)
    {
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited.add(s);
        while(!q.isEmpty())
        {
            int temp=q.poll();
            System.out.print(temp+" ");
            for (Integer x : graph.keySet())
            {
                if (!visited.contains(x)) {
                    q.add(x);
                    visited.add(x);
                }
            }
        }
    }
    void Dfsutil(int s,HashSet<Integer> visited)
    {
        System.out.print(s+" ");
        visited.add(s);
        for(Integer x: graph.get(s))
        {
            if(!visited.contains(x))
            {
                Dfsutil(x,visited);
            }
        }
    }
    void DFS(int s)
    {
        HashSet<Integer> visited=new HashSet<>();
        Dfsutil(s,visited);
    }
}
public class GraphSM {
    public static void main(String[] args) {
        GraphSetMap g = new GraphSetMap();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);


        g.addEdge(0, 1);
//      g.addEdge(0, 1);//we don't want a multiedge
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addVertex(2);

        g.print();
        System.out.println();
        System.out.println("-----BFS-----");
        g.BFS(0);
        System.out.println();
        System.out.println();
        System.out.println("-----DFS-----");
        g.DFS(0);
    }
}
