package DataStructures;
import java.util.Stack;
public class InfixtoPostfix {
    static int precedence(char a)
    {
        if(a=='+' || a=='-' )return 1;
        else if(a=='*' || a=='/')return 2;
        return -1;
    }
    static String infixtopost(String s)
    {
        Stack<Character> stack=new Stack<Character>();
        String res="";
        for(int i=0; i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                res+=c;
            }

            else
            {

                while(!stack.isEmpty() && precedence(stack.peek())>=precedence(c))
                {
                    res+=stack.pop();
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty())
        {
            res+=stack.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String s="3+4*5";
        String s2="3*4+5";
        System.out.println(infixtopost(s));
        System.out.println(infixtopost(s2));

    }
}
