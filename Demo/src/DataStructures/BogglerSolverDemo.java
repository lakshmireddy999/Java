package DataStructures;

import java.io.*;
import java.util.*;

import static java.lang.Thread.sleep;

public class BogglerSolverDemo {
   static HashSet<String> words=new HashSet<>();
   static int points=0;
    static HashMap<Character,HashSet<String>> dict=new HashMap<>();
    BogglerSolverDemo()
    {
        for(char c='a'; c<='z'; c++)
        {
            dict.put(c,new HashSet<>());
        }
    }
    void findWords(char[][] boggle)
    {
        int m=boggle.length;
        int n=boggle[0].length;
        boolean[][] visited =new boolean[m][n];
        String str = "";

        // traverse all matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                findWordsUtil(boggle,visited,i,j,str,m,n);
            }
        }
    }
    void findWordsUtil(char[][] boggle, boolean[][] visited, int i, int j, String str, int m, int n)
    {
        visited[i][j]=true;
        str+=boggle[i][j];
        if(search(str)) {
            words.add(str);
        }


        for(int row=i-1; row<=i+1 && row<m ; row++) {
            for (int col = j - 1; col <= j + 1 && col < n; col++) {
                if (row >= 0 && col >= 0 && !visited[row][col])
                    findWordsUtil(boggle, visited, row, col, str, m, n);
            }
        }
        visited[i][j]=false;
    }
    boolean search(String word)
    {
            if(dict.get(word.charAt(0)).contains(word))
                return true;
            else
                return false;
    }
    static void print(char boggle[][])
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
    static void enter(char [][]boggle)
    {
        print(boggle);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter strings ");
        String s[]=sc.nextLine().split(" ");
        for(String str:s)
        {
           if(words.contains(str))
           {
               points++;
           }
        }
        System.out.println("Total points you got"+points);
    }
    static int getIndex(String s)
    {
        return  (int)(s.length()*Math.random()); //it returns random index from a string of 26 alphabets
    }
    static void generateBoggle(char [][]boggle)
    {
        String s="abcdefghijklmnopqrstuvwxyz";  //random string of 26 alphabets used to generate boggle randomly
        for (int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                int index=getIndex(s);
                boggle[i][j]=s.charAt(index);
            }
        }
    }
    public static void main(String[] args) {
        BogglerSolverDemo bd=new BogglerSolverDemo();

        try
        {
            FileReader fr=new FileReader("mydictionary.txt");
            Scanner sc=new Scanner(fr);

           while(sc.hasNextLine())
           {
               String s=sc.nextLine();
             dict.get(s.charAt(0)).add(s);

           }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }

        char[][] boggle =new char[4][4];
        generateBoggle(boggle);


        System.out.println("Lets play Boggle game");
        long st=System.currentTimeMillis();
        System.out.println("Time start:"+st);
            bd.findWords(boggle);
            System.out.println("No of valid words"+bd.words.size());
            System.out.println(bd.words);
        long et=System.currentTimeMillis();
        System.out.println("End Time:"+et);
        System.out.println("Total Time taken "+(et-st));

    }
}
