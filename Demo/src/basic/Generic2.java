package basic;

public class Generic2 {
    <T> T get(T a)
    {
        return a;
    }

    public static void main(String[] args) {
        Generic2 g2=new Generic2();
        System.out.println(g2.get(1));
        System.out.println(g2.get(2.5));
        System.out.println(g2.get("Lakshmi"));
        System.out.println(g2.get(true));
    }
}
