package faculty;
class Exc
{
    void a()
    {
        System.out.println(50/0);
    }
    void b()
    {
        try
        {
            a();
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
    }

}
public class Exceptionhand7 {
    public static void main(String[] args) {
        Exc ee=new Exc();
        ee.b();
    }
}
