package graph;

import java.util.Scanner;

//Adjacency Matrix Implementation
public class GraphAlgos {

    static void dijkstras(int adjMatrix[][], int source)
    {
        int v = adjMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }
        //The arrays are ready & we have the source
        distance[source] = 0;
        for(int i=0;i<v-1;i++)
        {
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            //Traverse neighbors now
            for(int j=0;j<v;j++)
            {
                //Traverse neighbors that are unvisited
                if(adjMatrix[minVertex][j]!=0 && !visited[j]) //Not zero means neighbors
                {
                    int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
                    if(newDistance<distance[j])
                    {
                        distance[j] = newDistance;
                    }
                }
            }

        }
        System.out.println("Shortes paths from "+ source + " are: ");
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
        System.out.println();
    }

    static int findMinVertex(int distance[], boolean visited[])
    {
        int minVertex = -1;
        for(int i=0;i<distance.length;i++)
        {
            if(!visited[i] && (minVertex == -1 || distance[i]<distance[minVertex]))
            {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Vertices: ");
        int v = sc.nextInt();
        System.out.println("Enter number of Edges: ");
        int e = sc.nextInt();
        int adjMatrix[][] = new int[v][v];
        System.out.println("Enter all edges: ");
        for(int i=0;i<e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int w = sc.nextInt();
            adjMatrix[v1][v2] = w;
            adjMatrix[v2][v1] = w;
        }
        dijkstras(adjMatrix, 0);
    }

}

