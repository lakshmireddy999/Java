package faculty;
class calc
{
    void divide(int a,int b) throws ArithmeticException
    {
        System.out.println(a/b);
    }
}
public class ExceptionHand6 {
    public static void main(String[] args) {
        calc c=new calc();
        try
        {
            c.divide(10,0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
    }
}
