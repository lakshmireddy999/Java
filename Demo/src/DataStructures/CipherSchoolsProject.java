package DataStructures;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CipherSchoolsProject {
    static HashSet<String> words = new HashSet<>();
    static final int M = 4, N = 4;

    class Node {//Structure of each node
        public char c;
        public boolean isWord;//mark the ending character to find the word
        public Node[] children;//store all the children character of a node character

        Node(char data) {
            this.c = data;
            isWord = false;
            children = new Node[26];
        }
    }


    public Node root;//Root node of Trie


    CipherSchoolsProject() {
        root = new Node('\0');//beginning node blank value declaration
    }


     void insert(String word) {//Function for Trie creation
        Node curr = root;//pointing curr variable to root
        for (int i = 0; i < word.length(); i++) {//creation of nodes of trie tree
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;//mark end node as true to understand where the word ends
    }


    public boolean search(String word) {
        Node node = getNode(word);//check the word till the end
        return node != null && node.isWord;
    }


    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;//check the word upto certain point
    }


    public Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) return null;
            curr = curr.children[c - 'a'];
        }
        return curr;//Common funtion for startWith and search functions to find word in Trie
    }

    // A recursive function to print all words present on boggle
     void findWordsUtil(char boggle[][], boolean visited[][], int i,
                              int j, String str) {

        // Mark current cell as visited and append current character
        // to str
        visited[i][j] = true;
        str = str + boggle[i][j];

        // If str is present in dictionary, then print it
        if (search(str))
            words.add(str);

        // Traverse 8 adjacent cells of boggle[i][j]
        for (int row = i - 1; row <= i + 1 && row < M; row++)
            for (int col = j - 1; col <= j + 1 && col < N; col++)
                if (row >= 0 && col >= 0 && !visited[row][col])
                    findWordsUtil(boggle, visited, row, col, str);

        // Erase current character from string and mark visited
        // of current cell as false
        //str = "" + str.charAt(str.length() - 1);
        visited[i][j] = false;
    }

    // Prints all words present in dictionary.
     void findWords(char boggle[][]) {
        // Mark all characters as not visited
        boolean visited[][] = new boolean[M][N];

        // Initialize current string
        String str = "";

        // Consider every character and look for all words
        // starting with this character
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                findWordsUtil(boggle, visited, i, j, str);
    }

    public static void main(String[] args) throws Exception {

        CipherSchoolsProject boggle = new CipherSchoolsProject();

        char characters[][] = {{'g', 'i', 'z', 's'},
                {'u', 'e', 'k', 'a'},
                {'q', 's', 'e', 'o'},
                {'j', 'u', 'b', 'm'}};


        Scanner sc2 = new Scanner(new FileInputStream
                ("mydictionary.txt"));//importing dictionary file in sc2 scanner object
        while (sc2.hasNextLine()) {//checking whether word is present
            String line = sc2.nextLine();
            if (boggle.startsWith(line) || boggle.search(line)) {
                continue;
            } else {
                boggle.insert(line);
            }
        }
        boggle.findWords(characters);
        System.out.println("Iterating over list:");
        System.out.println(boggle.words);
        System.out.println(boggle.words.size());
    }
}

