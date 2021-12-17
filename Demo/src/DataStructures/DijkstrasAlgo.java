package DataStructures;
import java.util.*;

public class DijkstrasAlgo {
    static int findmin(int dist[],boolean visited[])
    {
        int min=-1;
        for(int i=0; i<dist.length; i++)
        {
            if(!visited[i] && (min==-1 || dist[i]<dist[min]))
            {
                min=i;
            }
        }
        return min;
    }
    static void dijkstra(int adj[][],int source)
    {
        int v= adj.length;
        int dist[]=new int[v];
        boolean visited[]=new boolean[v];
        for(int i=0; i<v; i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;
        for(int i=0; i<v-1; i++)
        {
            int minvertex=findmin(dist,visited);
            visited[minvertex]=true;
            for(int j=0; j<v; j++)
            {
                if(adj[minvertex][j]!=0 && !visited[j])
                {
                    int newdist=dist[minvertex]+adj[minvertex][j];
                    dist[j]=Math.min(newdist,dist[j]);
                }
            }
        }

        System.out.println("shortest paths from source are:");

        for(int i=0; i<v; i++)
        {
            System.out.print(dist[i]+" ");
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
        dijkstra(adj,1);
        /*
        0 1 4
0 2 8
1 2 2
1 3 5
2 3 5
2 4 9
3 4 4
         */
    }
}
