package CoreJava;
class A
{
    int r;
    String name;
    static int count=0;
    A(int r,String name)
    {
        this.r=r;
        this.name=name;
        count++;
    }
    static void show()
    {
        System.out.println(count);
    }
}
public class ObjectCount {
    public static void main(String[] args) {
        A a1=new A(1,"ram");
        A a2=new A(2,"sham");
        System.out.print("noOf objects:");
        A.show();
    }
}
