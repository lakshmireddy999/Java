package CoreJava;
import java.util.*;
public class ToggleCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        char chArr[]=new char[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
                chArr[i]=Character.toUpperCase(ch);
            else
                chArr[i]=Character.toLowerCase(ch);
        }

        String str=new String(chArr);
        System.out.println(str);
    }
}
