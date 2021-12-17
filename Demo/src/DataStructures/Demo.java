package DataStructures;
import java.util.*;
public class Demo {
    static void print(char [][]boggle)
    {
        for(int i=0; i<boggle.length; i++)
        {
            for(int j=0; j<boggle[i].length; j++)
            {
                System.out.print(boggle[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void play(char [][]boggle)
    {
        print(boggle);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter valid words from the Above board");
        String []str=sc.nextLine().split(" ");
        for(int i=0; i< str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char [][]boggle={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
       print(boggle);
        boolean b=true;
        while(b)
        {
            System.out.println("Press 1 for play \nPress 2 for Solution");
            int s=sc.nextInt();
            switch (s)
            {
                case 1:
                {
                    b=false;
                    break;
                }
                /*case 2:
                {
                    System.out.println("Boggle Board");
                    print(boggle);
                    //finding valid words from the boggle
                    boggleSolver.findWords(boggle);
                    System.out.println("\nValid words:");
                    // System.out.println(boggleSolver.words);
                    Iterator i=boggleSolver.words.iterator(); //using an iterator to traverse the hashset
                    while (i.hasNext())
                    {
                        System.out.print(i.next()+" "); //printing all valid words
                    }
                    System.out.println();
                    b=false;
                    break;
                }*/
                default:
                {
                    System.out.println("Wrong Input.... choose Again");
                    break;
                }
            }
        }
    }
}
