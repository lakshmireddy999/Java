package DataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class InputSeparatedbySpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        h.add("Lakshmi");
        h.add("Reddy");
        String []s=sc.nextLine().split(" ");

       for(String d:s)
       {
           if(h.contains(d))
               System.out.println("true");
       }
    }
}
