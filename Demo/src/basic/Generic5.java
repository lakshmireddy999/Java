package basic;
interface Example<E>
{
    void setvalue(E e);
}
class Aa<E> implements Example<E>
{
    E var;
    public void setvalue(E e)
    {
        var=e;
    }
}
public class Generic5 {
    public static void main(String[] args) {
        Aa<Integer> t=new Aa<Integer>();
        t.setvalue(5);
        System.out.println(t.var);
    }
}
