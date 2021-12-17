package DataStructures;

import java.util.Scanner;

public class PrimsAlgo {
    static int findMin(int dist[],boolean visited[])
    {
        int min=-1;
        for(int i=0; i<dist.length; i++)
        {
            if(!visited[i]&& (min==-1 || dist[i]<dist[min]))
            {
                min=i;
            }
        }
        return min;
    }
    static void Prims(int adj[][],int source)
    {
        int v=adj.length;
        int dist[]=new int[v];
        boolean visited[]=new boolean[v];
        int parent[]=new int[v];
        for(int i=0; i<v;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;
        parent[source]=-1;
        for(int i=0; i<v-1; i++)
        {
            int minVertex=findMin(dist,visited);
            visited[minVertex]=true;
            for(int j=0; j<v; j++)
            {
                if(adj[minVertex][j]!=0 && !visited[j])
                {
                    dist[j]=adj[minVertex][j];
                    parent[j]=minVertex;
                }
            }
        }
        int Mstsum=0;
        for(Integer x:dist)
        {
            Mstsum+=x;
        }
        System.out.println("total weight of Mst:"+Mstsum);

        System.out.println();
        System.out.println("Edges:");
        for(int i=0; i<v; i++)
        {
            if(parent[i]==-1)
            {
                System.out.println("source:"+i);
            }
            else
            {
                System.out.println("("+parent[i]+","+i+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices:");
        int v=sc.nextInt();
        int adj[][]=new int[v][v];
        System.out.println("enter no of edges:");
        int e=sc.nextInt();
        System.out.println("Enter all edges:");
        for(int i=0; i<e; i++)
        {
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            int w=sc.nextInt();
            adj[sv][ev]=w;
            adj[ev][sv]=w;
        }
        Prims(adj,0);
    }
}
