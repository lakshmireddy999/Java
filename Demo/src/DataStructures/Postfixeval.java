package DataStructures;
import java.util.Stack;
public class Postfixeval {
    static int eval(String s)
    {
        Stack<Integer> stack=new Stack();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            else
            {
                int left=stack.pop();
                int right=stack.pop();
                int res=calculate( left, right,c);
                stack.push(res);
            }
        }
        return stack.pop();
    }
    static int calculate(int a,int b,char c)
    {
        if(c=='+')return a+b;
        else if(c=='-')return a-b;
        else if(c=='*')return a*b;
        else if(c=='/')return a/b;
        return -1;
    }
    public static void main(String[] args) {
        String s="34*5+";
        String s2="345*+";

        System.out.println(eval(s));
        System.out.println(eval(s2));
    }
}
