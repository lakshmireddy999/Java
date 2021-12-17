package basic;
class Test<T>
{
    T a;
    Test(T i)
    {
        a=i;
    }
    T show()
    {
        return a;
    }
}
public class Generic4 {
    public static void main(String[] args) {
        Test<Integer> t=new Test<Integer>(10);
        System.out.println(t.show());

        Test t2=new Test("Lakshmi");
        System.out.println(t2.show());
    }
}
