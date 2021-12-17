package basic;

abstract class Calc
{
    int result;
    abstract void add(String a,String b);//no implementation, keyword is abstract,it can only be kept inside abstract method.
    void sub(int a,int b)
    {
        result=a-b;
        System.out.println("Result of sub is "+result);
    }
    void multiply(int a,int b)
    {
        result=a*b;
        System.out.println("Result of sub is "+result);
    }
    void divide(int a,int b)
    {
        result=a/b;
        System.out.println("Result of sub is "+result);
    }
}
class ScientificCalc extends Calc//how many methods?????
{
    void add(String a,String b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ScientificCalc c=new ScientificCalc();
        c.add("Hello ","Java");
        c.sub(5,2);
        c.multiply(5,2);
        c.divide(5,2);
    }
}
