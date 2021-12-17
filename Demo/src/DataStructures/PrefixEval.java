package DataStructures;
import java.util.Stack;
public class PrefixEval {
    static int calculate(int a,int b,char c)
    {
        if(c=='+')return a+b;
        else if(c=='-')return a-b;
        else if(c=='*')return a*b;
        else if(c=='/')return a/b;
        return -1;
    }
    static int eval(String s)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=s.length()-1; i>=0; i--)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            else if(!stack.isEmpty())
            {
                int right=stack.pop();
                int left=stack.pop();
                int res=calculate(right,left,c);
                stack.push(res);
            }


        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s="+3*45";
        String s2="-+8/632";
        System.out.println(eval(s));
        System.out.println(eval(s2));
    }
}
