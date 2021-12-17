package DataStructures;
import java.lang.*;
import java.util.*;

public class Anagram
{
   static boolean findAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return  false;

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int a1[]=new int[26];
        for(int i=0; i<s1.length(); i++)
        {
            a1[s1.charAt(i)-'a']++;
            a1[s2.charAt(i)-'a']++;
        }


        for(int i=0; i<26; i++)
        {
            if(a1[i]%2!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(findAnagram("silent","listen"));
        System.out.println(findAnagram("Triangle","Integral"));
        System.out.println(findAnagram("Lakshmi","Lakshni"));
    }
}