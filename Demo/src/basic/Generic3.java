package basic;

public class Generic3<T,V>{
    T a;
    V b;
    Generic3(T o1,V o2)
    {
        a=o1;
        b=o2;
    }
    void showTypes()
    {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
    }
    T getob1()
    {
        return a;
    }
    V getob2()
    {
        return b;
    }

    public static void main(String[] args) {
        Generic3<Integer,String> g=new Generic3<Integer,String>(10,"Java");
        g.showTypes();
        int v= g.getob1();
        System.out.println("value:"+v);
        String s= g.getob2();
        System.out.println("str:"+s);
    }
}
