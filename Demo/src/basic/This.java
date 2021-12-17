package basic;

class This
{
    This()
    {
        this(4,5);
        System.out.println("Default");
    }
   This(int a)
    {
        this();
        System.out.println("Parameterized");
    }
    This(int a,int b)
    {
        System.out.println("2 parameters");
    }
    public static void main(String[] args) {
        This d=new This(10);
    }
}
